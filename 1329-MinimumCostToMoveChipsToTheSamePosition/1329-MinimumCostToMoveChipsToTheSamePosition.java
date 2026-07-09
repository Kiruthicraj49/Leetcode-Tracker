// Last updated: 09/07/2026, 15:06:27
class Solution {
    public int minCostToMoveChips(int[] pos) {
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<pos.length;i++){
            if(pos[i]%2==0){
                evencount++;
            }
            if(pos[i]%2==1){
                oddcount++;
            }
        }
        return evencount>oddcount ? oddcount : evencount;
    }
}