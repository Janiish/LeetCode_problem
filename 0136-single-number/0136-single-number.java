class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                // We found a pair! Throw it away.
                set.remove(num); 
            } else {
                // First time seeing this number. Keep it.
                set.add(num); 
            }
        }
        
        // The only number left in the set is our single number
        return set.iterator().next();
    }
}