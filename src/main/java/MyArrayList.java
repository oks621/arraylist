package main.java;


import java.util.Arrays;

public class MyArrayList<T> {
    private T[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int size = DEFAULT_CAPACITY;

    public MyArrayList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return elements.length;
    }

    public T[] add(Object o) {
        if (size == elements.length) {
            resize();
        }
        elements[size] = (T) o;
        size++;
        return elements;
    }

    private T resize() {
        T[] newelements = (T[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newelements, 0, elements.length);
        elements = newelements;
        return (T) elements;
    }

    public void clear() {
        Arrays.fill(elements, null);
    }

    public T get(int index) {
        isIndexContains(index);
        return elements[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(elements) + " , size= " + elements.length;
    }

    public T remove(int index) {
        isIndexContains(index);
        T[] newelements = elements;
        T value = newelements[index];
        System.arraycopy(newelements, 0, elements, 0, index);
        System.arraycopy(newelements, index + 1, elements, index, newelements.length - index - 1);
        size--;
        return value;
    }

    private int isIndexContains(int index) {
        if (index >= elements.length || index < 0) {
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size
                    + ". Total size of array = " + elements.length);
        }
        return index;

    }

}

