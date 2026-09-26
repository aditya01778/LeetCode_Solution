import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int lp = 0;
        int rp = 1;
        Arrays.sort(nums);
        while(rp<nums.length) {
            if(nums[lp] == nums[rp]) {
                return true;
            }
            else{
                lp++;
                rp++;
            }
        }
        return false;
    }
}