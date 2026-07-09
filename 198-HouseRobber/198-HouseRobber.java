// Last updated: 09/07/2026, 15:07:47
class Solution {
    public int rob(int[] nums) {
    //     int n = nums.length;
    //     return helper(nums, n - 1);
    // }
    // int helper(int[] nums, int i) {
    //     if (i < 0) return 0;
    //     int take = nums[i] + helper(nums, i - 2);
    //     int nottake = helper(nums, i - 1);
    //     return Math.max(take, nottake);

        int n=nums.length;
        int[] dp = new int[n+1];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        return helper(nums,n-1,dp);
    }

    int helper (int[] nums,int i,int[] dp){
        if(i<0) return 0;
        if(dp[i] != -1) return dp[i];
        int take = nums[i] + helper(nums,i - 2,dp);
        int nottake = 0 + helper(nums,i-1,dp);
        return dp[i] = Math.max(take,nottake);
    }
}