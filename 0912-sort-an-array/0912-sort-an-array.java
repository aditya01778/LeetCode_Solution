class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(nums, n, i);
        for (int end = n - 1; end > 0; end--) {
            int t = nums[0]; nums[0] = nums[end]; nums[end] = t;
            heapify(nums, end, 0);
        }
        return nums;
    }

    private void heapify(int[] a, int n, int i) {
        while (true) {
            int largest = i, l = 2 * i + 1, r = 2 * i + 2;
            if (l < n && a[l] > a[largest]) largest = l;
            if (r < n && a[r] > a[largest]) largest = r;
            if (largest == i) break;
            int t = a[i]; a[i] = a[largest]; a[largest] = t;
            i = largest;
        }
    }
}