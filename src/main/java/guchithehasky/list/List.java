package guchithehasky.list;

public interface List<T> { // Змінив всі value i obj на element
    void add(T element);
    void add(T element, int index);
    T remove(int index);
    T get(int index);
    void set(T element, int index);
    void clear();
    int size();
    boolean isEmpty();
    boolean contains(T element);
    int indexOf(T element);
    int lastIndexOf(T element);
    String toString();

}
