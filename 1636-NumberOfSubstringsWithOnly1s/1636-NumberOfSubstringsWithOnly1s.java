// Last updated: 09/07/2026, 15:06:18
class Solution {
    public int numSub(String s) {
        long mod=1000000007;
        long count=0;
        long ones =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                ones++;
            }else{
                count=(count+(ones*(ones+1)/2))%mod;
                ones=0;
            }
        }
        count=(count+(ones*(ones+1)/2))%mod;
        return(int) count;
    }
}