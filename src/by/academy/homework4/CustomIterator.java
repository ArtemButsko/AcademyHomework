package by.academy.homework4;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator {

    private T[] array;
    private int size;
    private int index;

    public CustomIterator(){
        super();
    }

    public CustomIterator(T[] arr){
        this.array = arr;
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }


}
