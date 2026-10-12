// Last updated: 12/10/2026, 21:25:33
1class Solution {
2    public int countSubstrings(String s) {
3        int count = 0;
4        for (int i = 0; i < s.length(); i++) {
5            count += expandAroundCenter(s, i, i);
6            count += expandAroundCenter(s, i, i + 1);
7        }
8        return count;
9    }
10    private int expandAroundCenter(String s, int left, int right) {
11        int count = 0;
12        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
13            count++;
14            left--;
15            right++;
16        }
17        return count;
18    }
19}