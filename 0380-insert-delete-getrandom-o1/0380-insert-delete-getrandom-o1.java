class RandomizedSet {
    HashMap<Integer, Integer> map;  // value → index in list
    ArrayList<Integer> list;        // index → value
    Random rand = new Random();

    public RandomizedSet() {
        map  = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        map.put(val, list.size()); // record index before adding
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        int index   = map.get(val);               // index of val in list
        int lastVal = list.get(list.size() - 1);  // last element

        list.set(index, lastVal);                 // overwrite val's spot with last
        list.remove(list.size() - 1);             // remove last (O(1))

        map.put(lastVal, index);                  // update last's index in map
        map.remove(val);                          // remove val from map

        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size())); // O(1) random access
    }
}