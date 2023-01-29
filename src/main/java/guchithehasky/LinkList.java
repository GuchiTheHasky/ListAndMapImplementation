package guchithehasky;

public interface LinkList<T> {
    void addInEnd(T type);

    void addInStart(T type);
    int size();
    T get(int index);

}
