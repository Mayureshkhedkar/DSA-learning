class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set1 = new HashSet<>();
int zerocount=0;
        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);
            if (arr[i] == 0) {
                zerocount++;
            }
        }
        if(zerocount>=2) return true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                continue;
            if (set1.contains(2 * arr[i]))
                return true;
        }
        return false;
    }
}