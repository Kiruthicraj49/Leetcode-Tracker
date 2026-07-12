// Last updated: 12/07/2026, 09:04:08
1class Solution {
2    public int maxConsistentColumns(int[][] grid, int limit) {
3       int[][] ca = grid;
4        int m = grid.length;
5        int n = grid[0].length;
6        int[] dp = new int[n];
7        int max =1;
8        for(int j=0;j<n;j++){
9            dp[j]=1;
10            for(int i=0;i<j;i++){
11                boolean isconsistent=true;
12                for(int r=0;r<m;r++){
13                    if(Math.abs(grid[r][j] - grid[r][i]) > limit){
14                        isconsistent =false;
15                        break;
16                    }
17                }
18                if(isconsistent){
19                    dp[j] = Math.max(dp[j],dp[i] + 1);
20                }
21            }
22            max = Math.max(max,dp[j]);
23        }
24        return max;
25    }
26}