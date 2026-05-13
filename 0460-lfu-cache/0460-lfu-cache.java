class LFUCache {
    Map<Integer, Integer> vals;
    Map<Integer, Integer> counts;
    Map<Integer, LinkedHashSet<Integer>> lists;
    int min, capacity;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        vals = new HashMap<>();
        counts = new HashMap<>();
        lists = new HashMap<>();
        lists.put(1, new LinkedHashSet<>());
    }
    
    public int get(int key) {
        if (!vals.containsKey(key)) return -1; // return if no element found

        int count = counts.get(key);
        counts.put(key, count + 1); // Increment the count by 1

        lists.get(count).remove(key);

        if (count == min && lists.get(count).isEmpty()) {
            min++;
        }

        if (!lists.containsKey(count + 1)) {
            lists.put(count + 1, new LinkedHashSet<>());
        }

        lists.get(count + 1).add(key);

        return vals.get(key);
    }
    
    public void put(int key, int value) {
        if (capacity <= 0) return;

        if (vals.containsKey(key)) {
            vals.put(key, value);
            get(key);
            return;
        }

        if (vals.size() >= capacity) {
            int evict = lists.get(min).iterator().next();
            lists.get(min).remove(evict);
            vals.remove(evict);
            counts.remove(evict);
        }

        vals.put(key, value);
        min = 1;
        counts.put(key, 1);
        lists.get(1).add(key);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */