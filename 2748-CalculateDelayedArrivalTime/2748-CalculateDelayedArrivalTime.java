// Last updated: 09/07/2026, 15:05:41
class Solution {
    public int findDelayedArrivalTime(int aT, int dT) {
        int time=0;
        if((aT <=24) && (dT<=24)){
            time=aT+dT;
        }
        return (time%24);  
    }
}