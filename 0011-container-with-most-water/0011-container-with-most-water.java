class Solution {
    public int maxArea(int[] height) {
        int i =0;
        int j =height.length-1;
        // int area=0;
        int max=0;
        while (i<j){
            // area=Math.min(height[i],height[j])*(j-i);
           max=Math.max(max,Math.min(height[i],height[j])*(j-i));
            // if(height[i+1]>height[i]) i++;
            // else if(height[j-1]>height[j]) j--;
        if(height[i]<height[j]){
            i++;
        } 
        else{
            j--;
        }

        }
        return max;
    }
}