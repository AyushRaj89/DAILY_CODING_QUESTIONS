//Min Removals to Make Max <= 2*Min(https://www.geeksforgeeks.org/problems/remove-minimum-elements4612/1)

class Solution {
    public int minRemoval(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int maxLen = Integer.MIN_VALUE;
        int j = 0;
        
        for(int i = 0; i < n; i++) {
            
            while(j < n && arr[j] <= arr[i] * 2) {
                j++;
            }
            
            maxLen = Math.max(maxLen, j - i);
        }
        
        return n - maxLen;
    }
}
