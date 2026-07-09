// Last updated: 09/07/2026, 15:08:45
// class Solution {
//     public int minDistance(String d1, String d2) {
//         int n1= d1.length();
//         int n2= d2.length();
//         int ans = helper(d1,d2,n1,n2);
//         return ans;
//     }
//     public int helper(String ch1,String ch2,int n1,int n2){
//         if(n2==0) return n1;
//         if(n1==0) return n2;
//         if(ch1.charAt(n1-1) == ch2.charAt(n2-1)){
//             int ans =  0  + helper(ch1,ch2,n1-1,n2-1);
//             return ans;
//         }
//         int x = 1 + helper(ch1,ch2,n1-1,n2);
//         int y = 1 + helper(ch1,ch2,n1-1,n2-1);
//         int z = 1 + helper(ch1,ch2,n1,n2-1);
//         int result = Math.min(x,(Math.min(y,z)));
//         return result;
//     }
// }




class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(word1, word2, n, m);
    }
    public int helper(String s1, String s2, int n1, int n2) {
        if (n1 == 0) return n2;
        if (n2 == 0) return n1;
        if (dp[n1][n2] != -1) {
            return dp[n1][n2];
        }
        if (s1.charAt(n1 - 1) == s2.charAt(n2 - 1)) {
            return dp[n1][n2] = helper(s1, s2, n1 - 1, n2 - 1);
        }
        int insert = 1 + helper(s1, s2, n1, n2 - 1);
        int delete = 1 + helper(s1, s2, n1 - 1, n2);
        int replace = 1 + helper(s1, s2, n1 - 1, n2 - 1);
        return dp[n1][n2] = Math.min(insert, Math.min(delete, replace));
    }
}