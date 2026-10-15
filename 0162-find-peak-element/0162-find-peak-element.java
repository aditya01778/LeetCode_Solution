class Solution {
    public int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] < nums[mid + 1]) {
                lo = mid + 1;   // rising slope, a peak exists to the right
            } else {
                hi = mid;       // falling slope, mid itself or something left is a peak
            }
        }
        return lo;
    }
}