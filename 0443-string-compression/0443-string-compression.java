class Solution {
    public int compress(char[] chars) {

        int index = 0;   // Position to write in the array
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            // Count consecutive same characters
            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            // Store the character
            chars[index++] = current;

            // Store the count if greater than 1
            if (count > 1) {
                String str = Integer.toString(count);

                for (int j = 0; j < str.length(); j++) {
                    chars[index++] = str.charAt(j);
                }
            }
        }

        return index;
    }
}