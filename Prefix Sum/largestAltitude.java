//1732. Find the Highest Altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int max = 0;
        for(int num: gain) {
            current += num;
            max = Math.max(current, max);
        } 
        return max;
    }
}
