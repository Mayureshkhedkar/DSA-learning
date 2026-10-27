class Solution {
    public int[] sortedSquares(int[] nums) {
        int k= nums.length;
        // int[] sorted=new int[k];
        // for(int i=0;i<k;i++){
        //     if (nums[i]>=0){
        //         k=i-1;
        //         break;
        //     }
        // }
        // System.out.println(k);


        for(int i=0;i<k;i++){
            nums[i]=Math.abs(nums[i]);
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}