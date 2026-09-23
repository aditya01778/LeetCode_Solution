class Solution {
    public static int removeElement(int[] num, int val) {

        int count = 0;
        for(int i=0; i<num.length; i++){
            if(num[i]!=val){
                num[count] = num[i];
                count++;
            }

        }
        return count;
    }
}
 