class Solution {
    public int singleNumber(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
        int n = nums[i];
        result ^= n;
    }
    return result;
    }
}