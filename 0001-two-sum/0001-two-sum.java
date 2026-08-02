import java.util.*;
class Solution {
    public static int[] twoSum(int num[], int target) {
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i=0; i<num.length; i++){

            int b = target-num[i];
            if(map.containsKey(b)){
                int indexOfb = map.get(b);
                return new int [] {i,indexOfb};
            }

            // for storing if not found
            map.put(num[i], i);

        }
        return new int[] {-1,-1};

    }
}    