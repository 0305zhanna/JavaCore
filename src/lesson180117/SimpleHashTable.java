package lesson180117;

import static java.lang.Math.*;

public class SimpleHashTable<K,V> {
    Entry<K,V> table[];
    int size = 0;

    public SimpleHashTable(){
            table = (Entry<K,V>[]) new Entry[16];
    }

    public void put(K key, V value){
        int hash = key.hashCode();
        int index = abs(hash) % table.length;


        if (table[index] != null) {
            table[index] = new Entry<>(key,value);
        }else {
            Entry<K,V> cur = table[index];
            while (cur.next != null){
                if(key.equals(cur.key)){
                    cur.value = value;
                    size++;
                    return;
                }
                cur = cur.next;
            }
            cur.next = new Entry<>(key,value);
        }
        size++;
    }

//    public V get(K key){
//
//    }

//    public V remove(K key){
//
//    }

    class Entry<K,V>{
        final K key;
        V value;
        Entry<K,V> next;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

}
