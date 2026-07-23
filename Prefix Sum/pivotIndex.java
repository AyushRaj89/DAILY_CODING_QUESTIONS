//724. Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int total = 0;

        for(int num: nums) {
            total += num;
        }

        for(int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];

            if(rightSum == leftSum) {
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }
}
