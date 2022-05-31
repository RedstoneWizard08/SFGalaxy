package net.nosadnile.sfgalaxy.api;

import java.util.HashMap;
import java.util.Map;

public class SFGalaxyRegistry<T> {

    private Map<String, T> ITEMS;

    public SFGalaxyRegistry() {
        this.ITEMS = new HashMap<>();
    }

    public T get(String key) {
        return this.ITEMS.get(key);
    }

    public T register(String key, T value) {
        if (this.ITEMS.containsKey(key) || this.ITEMS.containsValue(value)) {
            return this.ITEMS.replace(key, value);
        } else {
            return this.ITEMS.put(key, value);
        }
    }

    public T unregister(String key) {
        return this.ITEMS.remove(key);
    }

    public Iterable<String> keys() {
        return this.ITEMS.keySet();
    }

    public Iterable<T> values() {
        return this.ITEMS.values();
    }

    public Iterable<Map.Entry<String, T>> entries() {
        return this.ITEMS.entrySet();
    }
}
