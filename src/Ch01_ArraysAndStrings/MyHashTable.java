package Ch01_ArraysAndStrings;

public class MyHashTable<Key, Val> {
    private Pair<Key, Val>[] buckets;
    private int capacity;
    private int size;

    public MyHashTable() {
        this(16);
    }

    @SuppressWarnings("unchecked")
    public MyHashTable(int capacity) {
        buckets = new Pair[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(Key key, Val value) {

        Pair<Key, Val> pair = getPair(key);
        if (pair != null) {
            pair.value = value; // update value
            return;
        }

        int hashCode = getHashCode(key);
        int index = getIndex(hashCode);

        pair = buckets[index];
        Pair<Key, Val> newPair = new Pair<Key, Val>(key, value);
        newPair.next = pair;
        buckets[index] = newPair;
        size++;
    }

    public Val remove(Key key) {
        isKeyNull(key);
        int hashCode = getHashCode(key);
        int index = getIndex(hashCode);

        Pair<Key, Val> pair = buckets[index];
        Pair<Key, Val> previous = null;
        while (pair != null) {
            if (pair.key.equals(key)) {
                break;
            }
            previous = pair;
            pair = pair.next;
        }

        if (pair == null) {
            return null;
        }

        if (previous != null) {
            previous.next = pair.next;
        } else {
            buckets[index] = pair.next;
        }
        size--;

        return pair.value;
    }

    public Val get(Key key) {
        Pair<Key, Val> pair = getPair(key);
        if (pair != null) {
            return pair.value;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < buckets.length; i++) {
            str.append(String.format("[%s]", i));
            // System.out.println(i);
            // System.out.println(buckets[i]);
            Pair<Key, Val> pair = buckets[i];
            while (pair != null) {
                str.append(String.format(" -> {key: %s, value: %s}", pair.key.toString(), pair.value.toString()));
                pair = pair.next;
            }
            str.append("\n");
        }
        return str.toString();
    }

    private Pair<Key, Val> getPair(Key key) {
        isKeyNull(key);
        int hashCode = getHashCode(key);
        int index = getIndex(hashCode);

        Pair<Key, Val> pair = buckets[index];
        while (pair != null) {
            if (pair.key.equals(key)) {
                return pair;
            }
            pair = pair.next;
        }

        return null;
    }

    private int getHashCode(Key key) {
        int hash = 5381;
        String strKey = key.toString();

        for (int i = 0; i < strKey.length(); i++) {
            hash = ((hash << 5) + hash) + strKey.charAt(i);
        }

        return hash;
    }

    private int getIndex(int hashCode) {
        return hashCode % capacity;
    }

    private void isKeyNull(Key k) {
        if (k == null) {
            throw new IllegalArgumentException("Null 'key' argument.");
        }
    }

    private class Pair<K, V> {
        private K key;
        private V value;
        private Pair<K, V> next;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
