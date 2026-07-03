//Sort Elements by Decreasing Frequency(GFG)

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        Integer[] nums = new Integer[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        
        Arrays.sort(nums, (a, b) -> {
          // If frequencies differ, higher frequency comes first.
          // Higher value first → b - a
            if(!freq.get(a).equals(freq.get(b))){
                return freq.get(b) - freq.get(a);
            }
          // If frequencies are same, smaller number comes first.
          // Smaller value first → a - b
            return a - b;
        });
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num: nums) {
            list.add(num);
        }
        
        return list;
    }
}
