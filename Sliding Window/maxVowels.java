//1456. Maximum Number of Vowels in a Substring of Given Length

class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) {
                count++;
            }
        }

        int startIdx = 0;
        int endIdx = k;

        int maxCount = count;

        while(endIdx < s.length()) {
            if(isVowel(s.charAt(startIdx))){
                count--;
            }
            startIdx++;

            if(isVowel(s.charAt(endIdx))){
                count++;
            }
            endIdx++;

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
