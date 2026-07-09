// Last updated: 09/07/2026, 15:05:16
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long common = Math.min(need1,need2);
        long ans = common*Math.min(costBoth,cost1+cost2);
        ans= ans+ (need1-common)*(long)Math.min(cost1,costBoth);
        ans = ans + (need2-common) * (long)Math.min(cost2,costBoth);
        return ans;
    }
}