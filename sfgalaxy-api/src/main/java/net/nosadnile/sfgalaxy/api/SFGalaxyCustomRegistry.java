package net.nosadnile.sfgalaxy.api;

import java.util.HashMap;
import java.util.Map;

public class SFGalaxyCustomRegistry<K, V> {

    private Map<K, V> ITEMS;

    public SFGalaxyCustomRegistry() {
        this.ITEMS = new HashMap<>();
    }

    public V get(K key) {
        return this.ITEMS.get(key);
    }

    public V register(K key, V value) {
        if (this.ITEMS.containsKey(key) || this.ITEMS.containsValue(value)) {
            return this.ITEMS.replace(key, value);
        } else {
            return this.ITEMS.put(key, value);
        }
    }

    public V unregister(K key) {
        return this.ITEMS.remove(key);
    }

    public Iterable<K> keys() {
        return this.ITEMS.keySet();
    }

    public Iterable<V> values() {
        return this.ITEMS.values();
    }

    public Iterable<Map.Entry<K, V>> entries() {
        return this.ITEMS.entrySet();
    }
}
