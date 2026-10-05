// Last updated: 05/10/2026, 22:24:30
1class Solution {
2    public int scoreOfParentheses(String s) {
3        int score = 0;
4        int depth = 0;
5        for (int i = 0; i < s.length(); i++) {
6            if (s.charAt(i) == '(') {
7                depth++;
8            } else {
9                depth--;
10                if (s.charAt(i - 1) == '(') {
11                    score += (1 << depth);
12                }
13            }
14        }
15        return score;
16    }
17}