package dataStructures.map;

import java.io.Serializable;

public class Map<K, V> {

    private static class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }
    }

    private final Integer size = 10;
    private Entry<K, V>[] table;

    public Map() {
        this.table = new Entry[size];
    }

    private Integer getModuleHash(K key) {
        return key.hashCode() % this.size;
    }

    public void put(K key, V value) {
        Integer hashModule = getModuleHash(key);
        Entry<K,V> pointer = table[hashModule];
        Entry<K,V> entry = new Entry<>(key, value);

        if (pointer.getKey() == key) {
            pointer.setValue(value);
            return;
        }

        if (pointer == null) {
            table[hashModule] = entry;
        } else {

            while (pointer.getNext() != null) {
                if (pointer.getKey() == key) {
                    pointer.setValue(value);
                    return;
                }
                pointer = pointer.getNext();
            }

            pointer.setNext(entry);
        }
    }

    public void remove(K key) {}

    public V get(K key) {
        return null;
    }

    public void clear() {}

}
