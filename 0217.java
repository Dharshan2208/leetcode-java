class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Done using hashmap

        // can be also done using hashset which i dont know so
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                return true;
            }
            hashMap.put(num, 1);
        }
        return false;
    }
}


// Have to do this using hashset