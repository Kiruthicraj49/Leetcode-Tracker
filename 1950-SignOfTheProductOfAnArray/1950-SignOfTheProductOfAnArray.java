// Last updated: 09/07/2026, 15:06:10
class Solution {
    public int arraySign(int[] nums) {
       int countn=0;
       for(int i:nums){
        if(i==0){
            return 0;
        }
        if( i<0){
            countn++;
        }
       }
       if(countn%2==0){
        return 1;
       }
       else{
        return -1;
       }

    }
}