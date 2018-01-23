package leson180115;

public class SimpleLinkedList <E> implements SimpleList<E>{
    int size = 0;
    Entry<E> first;
    Entry<E> last;

    @Override
    public void add(E value) {
        Entry<E> newEntry = new Entry<>(value);
        if(first == null){
            first = last = newEntry;
        }else {
            last.next = newEntry;
            last = newEntry;
        }
        size++;
    }

    @Override
    public E get(int index) {
        checkBounds(index);
        Entry<E> cur = getEntry(index);
        return cur.value;
    }

    @Override
    public void remove(int index) {
        checkBounds(index);

        if(index == 0){
            first = first.next;
            if(size == 1){
                last = first;
            }
        } else {
            Entry<E> cur = getEntry(index-1);
            cur.next=cur.next.next;
            if(cur.next == null){
                last = null;
            }
        }


        size--;
    }

    private Entry<E> getEntry(int index) {
        Entry<E> cur = first;
        for (int i = 0; i <index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    @Override
    public int size() {
        return 0;
    }

    private void checkBounds(int index) {
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Index must be >= 0, "+(size()-1));
        }
    }

    static class Entry<E>{
        final E value;
        Entry<E> next;
        Entry(E value) {
            this.value = value;
            this.next = null;
        }
    }
}
