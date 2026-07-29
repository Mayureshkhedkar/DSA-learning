class Solution {
    public static int bs(int[] nums,int i,int j,int target){  
        while (i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target) return mid;
            if(target>nums[mid]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        if(nums.length==1){
            if(target==nums[0]) return 0;
            return -1;
        }
        int k=0;


        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) {
                k=i;
                break;
            }
        }
        if(k==0){
            return bs(nums,0,nums.length-1,target);
        }
        System.out.println(k);
        if(target >nums[nums.length-1]){
          return bs(nums,0,k-1,target);   
        }
        else{
            return bs(nums,k,nums.length,target);
           
        }
    }
}