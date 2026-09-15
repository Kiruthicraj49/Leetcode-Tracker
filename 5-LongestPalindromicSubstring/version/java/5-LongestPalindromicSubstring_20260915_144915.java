// Last updated: 15/09/2026, 14:49:15
1class Solution {
2    public String longestPalindrome(String s) {
3        String res = "";
4        for (int i = 0; i < s.length(); i++) {
5            int l = i, r = i;
6            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
7                if (r - l + 1 > res.length()) {
8                    res = s.substring(l, r + 1);
9                }
10                l--;
11                r++;
12            }
13            l = i; 
14            r = i + 1;
15            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
16                if (r - l + 1 > res.length()) {
17                    res = s.substring(l, r + 1);
18                }
19                l--;
20                r++;
21            }
22        }
23        return res;
24    }
25}