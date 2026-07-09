// Last updated: 09/07/2026, 15:06:50
class Solution {
    public boolean hasAlternatingBits(int n) {
        int y=n>>1;
        while(n!=0){
            if((n&1) == (y&1)){
                break;
            }
            n=n>>1;
            y=y>>1;
        }
        return n==0 ? true : false;
    }
}