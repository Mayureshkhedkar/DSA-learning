class Solution {
    public int longestPalindrome(String s) {
        int[] char1 = new int[128];
        int max = 0;
        boolean hasOdd = false;
        for (char c : s.toCharArray()) {
            char1[c]++;
        }
        for (int count : char1) {
            if (count % 2 == 0) {
                max += count;
            } else {
                max += count - 1;
                hasOdd = true;
            }
        }
        if (hasOdd)
            max += 1;
        return max;
    }
}