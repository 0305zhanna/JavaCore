package leson180115;

import java.util.Iterator;

public class SimpleArrayQueue<E> implements Iterable<E>{

    private final int CAPASITY = 5;
    Object[] array;
    int size = 0;
    int head;
    int tail;

    public SimpleArrayQueue(){
        array = new Object[CAPASITY];
    }

    public void enqueue(E value){
        if(size >= array.length){
            throw new RuntimeException("Queue is totally full!");
        }

        array[tail] = value;
        tail = (tail + 1) % array.length;
        size++;
    }

    public E dequeue(){
        if(size == 0){
            throw new RuntimeException("Queue is empty!");
        }

        E value = (E) array[head];
        size--;
        head = (head + 1) % array.length;
        return value;
    }

    @Override
    public Iterator<E> iterator() {
        return new SimpleQueueIterator<>(this);
    }

    class SimpleQueueIterator<E> implements Iterator<E>{
        int cur;
        int count = 0;

        public SimpleQueueIterator(SimpleArrayQueue<E> queue){
            this.cur = queue.head;
        }

        @Override
        public boolean hasNext() {
            return count < size;
        }

        @Override
        public E next() {
//            Object value = queue.array[cur];
            cur = (head + 1) % array.length;
            count++;
            return null;
//            return (E) value;
        }
    }
}
