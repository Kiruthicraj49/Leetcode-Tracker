// Last updated: 09/07/2026, 15:08:46
class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int first=1;
        int sec=2;
        for(int i=3;i<=n;i++){
            int third = first+sec;
            first=sec;
            sec=third;
        }
        return sec;
    }
}