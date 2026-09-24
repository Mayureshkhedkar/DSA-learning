class Solution {
    public boolean isPalindrome(int x) {
        if (x< 0) return false;
        int original=x;
        int y=0;
        while (x!=0){
            int temp=x%10;
            x=x/10;
            y= (y*10) + temp;
        }
        if (y==original) return true;

        return false ;
    }
}