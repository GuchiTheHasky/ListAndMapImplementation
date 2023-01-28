package guchithehasky;

public interface List<T> {
    void add(Object value);
    void add(Object value, int index);
    T remove(int index);
    T get(int index);
    void set(Object value, int index);
    void clear();
    int size();
    boolean isEmpty();
    boolean contains(Object obj);
    int indexOf(Object obj);
    int lastIndexOf(Object obj);
    String toString();

}
