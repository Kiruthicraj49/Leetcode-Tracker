// Last updated: 09/07/2026, 15:05:22
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd=0,dd=0;
        for (int x:nums){
            if(x<10){
                sd=sd+x;
            }
            else{
                dd=dd+x;
            }
        }
        return dd!=sd? true:false;
    }
}