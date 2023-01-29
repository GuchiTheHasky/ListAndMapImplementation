//package guchithehasky;
//
//import java.util.*;
//import java.util.Hashtable;
//import java.util.LinkedList;
//
//public class HashMap<K, V> implements MapList<K, V> {
//
//    private Node<K, V>[] hashTable;
//    private int size = 0;
//    private float threshold;
//
//    public HashMap() {
//        hashTable = new Node[16];
//        threshold = hashTable.length * 0.75f;
//    }
//
//
//
//    @Override
//    public boolean insert(K key, V value) {
//        if (size + 1 >= threshold) {
//            threshold *= 2;
//
//        }
//
//        return false;
//    }
//
//    @Override
//    public boolean delete(K key) {
//        return false;
//    }
//
//    @Override
//    public V get(K key) {
//        int index = hash(key);
//        if (index < hashTable.length && hashTable[index] != null){
//            LinkedList<Node<K, V>> list = hashTable[index].getNodes();
//            for (Node<K, V> node : list) {
//                if (key.equals(node.getKey())){
//                   return node.getValue();
//                }
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    @Override
//    public Iterator<V> iterator() {
//        return new Iterator<V>() {
//            @Override
//            public boolean hasNext() {
//
//                return false;
//            }
//
//            @Override
//            public V next() {
//                return null;
//            }
//        };
//    }
//
//    private int hash(final K key){
//        int hash = 31;
//        hash = hash * 17 + key.hashCode();
//    return hash % hashTable.length;
//    }
//}
//
//
//private class Node<K, V> {
//    private K key;
//    private V value;
//
//    private int hash;
//    private LinkedList<Node<K, V>> nodes;
//
//    private Node(K key, V value) {
//        this.key = key;
//        this.value = value;
//        nodes = new LinkedList<Node<K, V>>();
//    }
//
//    private LinkedList<Node<K, V>> getNodes() {
//        return nodes;
//    }
//
//    private int hash() {
//        return hashCode() % hashTable.lehgth;
//    }
//}
//
