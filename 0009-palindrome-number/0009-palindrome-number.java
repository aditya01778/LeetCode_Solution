class Solution {
    public boolean isPalindrome(int x) {
        // agar number negative hai to false
    if(x < 0) {
            return false;
        }
    int original = x;
    int reverse = 0;
        // agar positive hai t
        while(x != 0) {

            // last digit nikalna
            int digit = x % 10;
            // last ke digit ko store kre hai reverse ke 1st place pe
            reverse = reverse * 10 + digit;
            // remove krenge lastelement ko x se
            x = x / 10;
        }
        return original == reverse;
    }
}