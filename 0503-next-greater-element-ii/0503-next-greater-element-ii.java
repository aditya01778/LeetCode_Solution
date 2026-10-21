import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nextGreater = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            // step 1: pop all smaller or equal elements
            while (!s.isEmpty() && nums[s.peek()] <= nums[idx]) {
                s.pop();
            }

            // step 2: only fill the answer during the real pass (i < n)
            if (i < n) {
                if (s.isEmpty()) {
                    nextGreater[idx] = -1;
                } else {
                    nextGreater[idx] = nums[s.peek()];
                }
            }

            // step 3: push current index
            s.push(idx);
        }

        return nextGreater;
    }
}