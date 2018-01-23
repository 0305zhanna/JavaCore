package leson180115;

import java.util.Arrays;

public class SimpleArrayList<E> implements SimpleList<E> {
    Object[] array;
    int size;
    int capasity;

    public SimpleArrayList(){
        array = new Object[5];
    }

    @Override
    public void add(E el){
        if(size == array.length){
            Object[] newArray = new Object[(int ) (size * 3/2)];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = el;
    }

    @Override
    public E get(int index) {
        //todo check bounds
        return (E) array[index];
    }

    @Override
    public void remove(int index){
        //skipped index bounds
        for (int i = index+1; i < array.length; i++) {
            array[i-1] = array[i];
        }
        array[--size] = null;
    }
    @Override
    public int size(){
        return size;
    }

}
