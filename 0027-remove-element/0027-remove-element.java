class Solution {
    public static int removeElement(int[] num, int val) {
        int k=0;
        for(int i=0; i<num.length; i++){
            if(num[i]!=val){
                num[k]= num[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int num[]= {3,2,3,2};
        int val = 3;
        System.out.println(removeElement(num,val));
    }
}