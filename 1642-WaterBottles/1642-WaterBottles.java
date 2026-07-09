// Last updated: 09/07/2026, 15:06:17
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank=0;
        int empty=0;
        int full = numBottles;
        while(full>0){
            totalDrank=totalDrank+full;
            empty=empty+full;
            full=empty/numExchange;
            empty=empty%numExchange;
        }
        return totalDrank;
    }
}