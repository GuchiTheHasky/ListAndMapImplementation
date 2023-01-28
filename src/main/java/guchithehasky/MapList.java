package guchithehasky;

public interface MapList<K, V> extends Iterable<V> { //comment
    boolean insert (K key, V value);
    boolean delete (K key);
    V get(K key);
    int size();


}
