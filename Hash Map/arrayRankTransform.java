//1331. Rank Transform of an Array

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> ranked = new HashMap<>();
        int rank = 1;
        for(int num: sorted) {
            if(!ranked.containsKey(num)) {
                ranked.put(num, rank++);
            }
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = ranked.get(arr[i]);
        }

        return arr;
    }
}
