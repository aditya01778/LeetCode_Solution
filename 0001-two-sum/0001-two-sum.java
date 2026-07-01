class Solution {
    public static int[] twoSum(int num[], int target) {
        int n = num.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (num[i] + num[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};

    }

    public static void main(String[] args) {
        int num[] = { 11, 7, 2, 15 };
        int target = 9;
        System.out.println("The indices of the two numbers that add up to the target are: ");
        int result[] = twoSum(num, target);
        System.out.println(result[0] + " " + result[1]);

    }
}