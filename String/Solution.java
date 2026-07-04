//Anagram(GFG)
//they contain the exact same characters with the same frequencies, regardless of their order

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
         s1 = s1.replaceAll("//s", "").toLowerCase();
         s2 = s2.replaceAll("//s", "").toLowerCase();
        
        if(s1.length() != s2.length()){
            return false;
        }
        
        int[] countFreq = new int[26];
        
        for(int i = 0; i < s1.length(); i++) {
            countFreq[s1.charAt(i) - 'a']++;
            countFreq[s2.charAt(i) - 'a']--;
        }
        
        for(int count: countFreq) {
            if(count != 0) {
                return false;
            }
        }
        
        return true;
    }
}
