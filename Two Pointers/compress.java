//443. String Compression

class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while(i < chars.length) {
            int count = 0;
            char ch = chars[i];
            while(i < chars.length && chars[i] == ch) {
                i++;
                count++;
            }

            chars[index++] = ch;

            if(count > 1) {
                for(char c: String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}
