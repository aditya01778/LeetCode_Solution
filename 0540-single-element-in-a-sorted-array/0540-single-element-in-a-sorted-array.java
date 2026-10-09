class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Force mid to be even so it pairs with mid + 1
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                // Pairs are intact up to here, so single is on the right
                left = mid + 2;
            } else {
                // Pair is broken, so single is at mid or to the left
                right = mid;
            }
        }
        return nums[left];
    }
}