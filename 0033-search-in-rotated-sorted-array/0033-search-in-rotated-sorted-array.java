class Solution {

    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] arr, int target, int si, int ei) {

        // base case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // target found
        if (arr[mid] == target) {
            return mid;
        }

        // Left half is sorted
        if (arr[si] <= arr[mid]) {

            // target lies in left half
            if (arr[si] <= target && target < arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                return search(arr, target, mid + 1, ei);
            }
        }

        // Right half is sorted
        else {

            // target lies in right half
            if (arr[mid] < target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                return search(arr, target, si, mid - 1);
            }
        }
    }
}