// Last updated: 09/07/2026, 15:06:52
// class Solution {
//     public int minDistance(String d1, String d2) {
//         int n1 = d1.length();
//         int n2 = d2.length();
//         int ans = helper(d1,d2,n1,n2);
//         return ans;
//     }
//     public int helper(String ch1,String ch2,int n1,int n2){
//         if (n1 == 0) return n2;
//         if (n2 == 0) return n1;
//         if (ch1.charAt(n1 - 1) == ch2.charAt(n2 - 1)) {
//             return helper(ch1, ch2, n1 - 1, n2 - 1);
//         }
//         int x = 1 + helper(ch1, ch2, n1 - 1, n2);
//         int y = 1 + helper(ch1, ch2, n1, n2 - 1);

//         return Math.min(x,y);
//     }
// }



class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int lcs = dp[n][m];
        return n + m - 2 * lcs;
    }
}