// Last updated: 15/09/2026, 09:20:06
1class Solution {
2    public int maxPalindromes(String s, int k) {
3        int n = s.length();
4        int count = 0;
5        int lastEnd = -1;
6        for (int center = 0; center < n; center++) {
7            for (int p = 0; p < 2; p++) {
8                int l = center;
9                int r = center + p;
10                while (l > lastEnd && r < n && s.charAt(l) == s.charAt(r)) {
11                    if (r - l + 1 >= k) {
12                        count++;
13                        lastEnd = r;
14                        break; 
15                    }
16                    l--;
17                    r++;
18                }
19                if (lastEnd == r) {
20                    break;
21                }
22            }
23        }
24        return count;
25    }
26}