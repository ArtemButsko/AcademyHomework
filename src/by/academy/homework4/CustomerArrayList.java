package by.academy.homework4;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CustomerArrayList<T> {
    private static final int DEFAULT_CAPACITY = 16;
    private T[] array;
    private int index = 0;

    public CustomerArrayList() {
        super();
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public CustomerArrayList(int capacity) {
        super();
        this.array = (T[]) new Object[capacity];
    }

    public void add(T obj) {
        if (array.length <= index) {
            grow();
        }
        array[index++] = obj;
    }

    private void grow() {
        T[] newArray = (T[]) new Object[array.length * 2 + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.print(array[i]+",");
        }
    }

    public T get(int i) {
        return array[i];
    }

    public T getLast() {
        if (index == 0) {
            return null;
        }
        return array[index - 1];
    }
    public T getFirst() {
        if (index == 0) {
            return null;
        }
        return array[0];
    }

    public int size() {
        return index;
    }

    public int capacity() {
        return array.length;
    }

   public T remove(int i) {

        T temp = array[i];
        System.arraycopy(array, i +1 , array, i , index - i-1);
        array[array.length - 1] = null;
        index--;
        return temp;
    }

    public T remove(T obj) {

        for (int i = 0; i < index; i++) {
            if (array[i].equals(obj)) {
                return remove(i);
            }
        }
        return null;
    }

}
