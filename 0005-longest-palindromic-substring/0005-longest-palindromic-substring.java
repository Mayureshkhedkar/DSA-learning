class Solution {
    public boolean isPal(String st,int i,int j){
        while(i<j){
            if(st.charAt(i)!=st.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int max=0,str=0,end=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPal(s,i,j)){
                    if(j-i+1>max) {
                        max=j-i+1;
                        str=i;
                        end=j+1;
                    }
                }
            }
        }

        return s.substring(str,end);
    }
}