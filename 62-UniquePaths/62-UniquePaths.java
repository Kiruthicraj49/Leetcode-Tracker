// Last updated: 09/07/2026, 15:08:49
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = helper(0,0,m,n,dp);
        return ans;
    }
    public int helper(int i,int j,int m,int n,int[][] dp){
        if(i>=m || j>=n) return 0;
        if(i==m-1 && j==n-1) return 1;
        if (dp[i][j] != -1) return dp[i][j];
        int x = helper(i+1,j,m,n,dp);
        int y = helper(i,j+1,m,n,dp);
        return dp[i][j] = x+y;
    }
}