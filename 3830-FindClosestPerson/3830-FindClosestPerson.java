// Last updated: 09/07/2026, 15:05:19
class Solution {
    public int findClosest(int x, int y, int z) {
        int diff1;
        int diff2;
        diff1=Math.abs(z-x);
        diff2=Math.abs(z-y);
        if(diff1>diff2){
            return 2;
        }
        else if(diff1<diff2){
            return 1;
        }
        else{
            return 0;
        }
    }
}