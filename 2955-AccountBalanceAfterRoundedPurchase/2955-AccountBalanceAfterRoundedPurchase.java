// Last updated: 09/07/2026, 15:05:31
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rounded = ((purchaseAmount+5)/10)*10;
        return 100 - rounded;
    }
}