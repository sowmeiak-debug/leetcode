class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int sum=0;
        if(x<0)
        return false;
        while(y!=0){
            int rem=y%10;
            sum=sum*10+rem;
            y=y/10;
        }
        if(sum==x)
        return true;
        else 
        return false;
    }
}