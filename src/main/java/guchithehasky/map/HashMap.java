package guchithehasky.map;

import java.util.Objects;

public class HashMap<K, V> implements Map<K, V> {

    static class Entry<K, V>{
        private K key;
        private V value;
        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public static final int DEFAULT_CAPACITY = 16;
    private int size;
    private Entry<K, V>[] entries = new Entry[DEFAULT_CAPACITY];


    @SuppressWarnings("unchecked")
    @Override
    public V put(K key, V value) {
        if (!isKeyExist(key)) {
            if (!Objects.isNull(value)) {
                rise();
                Entry<K, V> entry = new Entry(key, value);
                entries[size] = entry;
                size++;
                sortEntryMap();
                return (V) entry;
            }
        }
        return null;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (entries[i].getKey().equals(key)){
                return entries[i].getValue();
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public V remove(K key) {
        for (int i = 0; i < size; i++) {
            if (entries[i].getKey().equals(key)){
                Entry<K, V> deletedEntry = entries[i];
                Entry<K, V>[] tempEntries = (Entry<K, V>[]) new Entry[size - 1];
                int count = 0;
                for (int j = 0; j < size; j++){
                    if (j != i){
                        tempEntries[count] = entries[j];
                        count++;
                    }
                }
                size--;
                entries = tempEntries;
                return deletedEntry.getValue();
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        for (int i = 0; i < size; i++) {
            if (entries[i].getKey().equals(key)){
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    private void rise() {
        if (size == DEFAULT_CAPACITY) {
            Entry<K, V>[] tempEntries = (Entry<K, V>[])new Object[size * 2];
            System.arraycopy(entries, 0, tempEntries, 0, size);
            entries = tempEntries;
        }
    }

    private void sortEntryMap(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (getCharAtValueInt(entries[i].getKey()) < getCharAtValueInt(entries[j].getKey())){
                    Entry<K, V> temp = entries[i];
                    entries[i] = entries[j];
                    entries[j] = temp;
                }
            }
        }
    }

    private int getCharAtValueInt(K key){
        String str = key.toString();
        return str.charAt(0);
    }
    private boolean isKeyExist(K key){
        for (int i = 0; i < size; i++) {
            if (entries[i].getKey().equals(key)){
                return true;
            }
        }
        return false;
    }
}

