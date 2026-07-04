//28. Find the Index of the First Occurrence in a String
// j tells us how far we've moved inside the needle, while i tells us where the current attempt started in the haystack.
// n - m: The last index where the entire needle can still fit in the haystack.
// i: The starting position currently being tested.
// j: The offset (how many characters into the needle you've already matched).
// i + j: The corresponding character in the haystack that should match needle[j]
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m  = needle.length();

        for(int i = 0; i <= n-m; i++) {
            int j = 0;
            while(j < m && haystack.charAt(i+j) == needle.charAt(j)) {
                j++;
            }

            if(j == m) {
                return i;
            }
        }
        return -1;
    }
}
