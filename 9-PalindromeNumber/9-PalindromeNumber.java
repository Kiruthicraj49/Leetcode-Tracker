// Last updated: 09/07/2026, 15:09:11
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev=0;
        int original=x;
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        if(rev==original){
            return true;
        }
        else{
            return false;
        }
    }
}