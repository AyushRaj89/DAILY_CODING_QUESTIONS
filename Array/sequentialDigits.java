//1291. Sequential Digits

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        String digit = "123456789";
        for(int len = lowLen; len <= highLen; len++) {
            for(int i = 0; i + len <= 9; i++) {
                int num = Integer.parseInt(digit.substring(i, i+len));
                if(num >= low && num <= high) {
                    list.add(num);
                }
            }
        }
        return list;
    }
}
