class Solution {
    public int search(int[] nums, int target) {
        int st=0;
        int n=nums.length;
        int end = n-1;

        while(st <= end) {
            int mid = (st+end)/2;

            if(nums[mid] == target){
                return mid;
            }

            // if left part sorted
            if(nums[st] <= nums[mid]){
                // left partme search
                if(nums[st] <= target && target <= nums[mid]){
                    end = mid-1;
                }
                else{
                    st = mid +1;
                }

            }
            // right part sorted
            else{
                if(nums[mid] <= target && target<=nums[end]){
                    st = mid +1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}