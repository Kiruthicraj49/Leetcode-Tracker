// Last updated: 09/07/2026, 15:07:04
class Solution {
    public int arrangeCoins(int n) {
        int row=1;
        while(n>=row){
            n=n-row;
            row++;
        }
        return row-1;
    }
}