class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set1 = new HashSet<>();
        int zerocount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (set1.contains(2 * arr[i]) || (arr[i] % 2 == 0 && set1.contains(arr[i] / 2))) {
                return true;
            }
            set1.add(arr[i]);
        }
        return false;
    }
}