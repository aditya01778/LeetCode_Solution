class Solution {
    public int[] plusOne(int[] digits) {
        // loop to traverse element from last 
        for(int i=digits.length-1; i>=0; i--) {

            // case1
            if(digits[i]<9) {
                digits[i]++;
                return digits;
            }
            // cse2
            else{
                digits[i] = 0;
            }

        }
        // case3 sara element 9 hai 
        int newNumber[] = new int[digits.length+1];
        newNumber[0] = 1;
        return newNumber;
        
    }
}
