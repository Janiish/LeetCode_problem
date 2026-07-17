class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;  // number of unique elements (and write index)

        for (int x : nums) {
            if (k == 0 || x != nums[k - 1]) {
                nums[k] = x;
                k++;
            }
        }

        return k;
    }
}
