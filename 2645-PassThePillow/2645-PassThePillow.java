// Last updated: 09/07/2026, 15:05:45
class Solution {
    public int passThePillow(int n, int time) {
        int cycle =time/(n-1);
        int rem=time%(n-1);
        if(cycle%2==0){
            // forward direction
            return rem+1;
        }else{
            //backward direction
            return n-rem;
        }
    }
}