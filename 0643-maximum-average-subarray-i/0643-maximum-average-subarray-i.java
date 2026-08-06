class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length==0) return 0;
        if (nums.length==1) return nums[0]/k;
        // double max=Double.NEGATIVE_INFINITY;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max1=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            max1=Math.max(max1,sum);
        }
        return max1/k;
    }
}