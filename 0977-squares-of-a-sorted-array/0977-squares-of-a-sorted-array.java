class Solution {
    public int[] sortedSquares(int[] nums) {
        int k= nums.length;
       
        for(int i=0;i<k;i++){
            nums[i]=Math.abs(nums[i]);
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}