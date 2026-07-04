//14. Longest Common Prefix

// 1. The common prefix cannot be longer than the first string.
// 2. Compare characters at the same index across all strings.
// 3. Stop when a mismatch is found or a string ends.
// 4. Return the substring from index 0 to the mismatch position.
// 5. No mismatch is ever found: This means the entire first string is the common prefix.
// 5. Time: O(n × m), Space: O(1)

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }

        for(int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++) {
                if(i == strs[j].length() || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
