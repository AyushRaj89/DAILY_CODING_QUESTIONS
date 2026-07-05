//1071. Greatest Common Divisor of Strings

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) {
            return "";
        }
      //If concatenating in different orders gives different results, the strings are not composed of the same repeating pattern, so no common divisor string can exist.

        int len = gcd(str1.length(), str2.length());
      //The greatest common divisor string must have a length that divides both string lengths. The largest possible such length is the numeric GCD.

        return str1.substring(0, len);
      //Since the strings share the same repeating pattern (verified in Step 1), the first gcd characters form the largest repeating unit that divides both.
    }

    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
