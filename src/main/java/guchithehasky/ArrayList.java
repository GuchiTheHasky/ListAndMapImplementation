package guchithehasky;

import java.util.Objects;
import java.util.StringJoiner;

public class ArrayList<T> implements List<T> {
    private Object[] array;
    private int size;
    public static final int DEFAULT_CAPACITY = 5;

    public ArrayList(int initCapacity) {
        if (initCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        array = new Object[initCapacity];
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public void checkId() {
        if (array.length == size) {
            Object[] tempArray = new Object[array.length * 2];
            System.arraycopy(array, 0, tempArray, 0, size);
            array = tempArray;
        }

    }

    @Override
    public void add(Object value) {
        checkId();
        array[size] = value;
        size++;
    }


    @Override
    public void add(Object value, int index) {
        Objects.checkIndex(index, size);
        checkId();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
    }

    @Override
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T element = (T) array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return element;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) array[index];
    }

    @Override
    public void set(Object value, int index) {
        Objects.checkIndex(index, size);
        array[index] = value;
    }

    @Override
    public void clear() {
        size = 0;
        array = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object obj) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object obj) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        for (int i = size - 1; i > -1; i--) {
            if (array[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString(){
        StringJoiner joiner = new StringJoiner("," , "{", "}");
        for (int i = 0; i < size; i++) {
            joiner.add(array[i].toString());
        }
        return joiner.toString();
    }


}

