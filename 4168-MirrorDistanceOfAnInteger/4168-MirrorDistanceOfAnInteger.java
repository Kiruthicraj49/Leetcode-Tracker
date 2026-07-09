// Last updated: 09/07/2026, 15:05:13
class Solution {
    public int mirrorDistance(int n) {
        int org = n;
        int rev=0;
        while(n>0){
            int digit = n%10;
            rev = rev *10+digit;
            n=n/10;
        }
        return Math.abs(org-rev);
    }
}