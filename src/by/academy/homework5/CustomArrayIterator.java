package by.academy.homework5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomArrayIterator<T> implements Iterator {
    private T[][] arr;
    private int i, j;

    public CustomArrayIterator() {
    }

    public CustomArrayIterator(T[][] arr) {
        super();
        this.arr = arr;
    }


    @Override
    public boolean hasNext() {

        if (j == arr[i].length) {
            i++;
            j = 0;
        }


        return true;
    }

    @Override
    public T next() {

        return arr[i][j++];

    }


}
