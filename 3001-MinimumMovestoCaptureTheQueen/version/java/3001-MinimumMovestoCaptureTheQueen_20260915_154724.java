// Last updated: 15/09/2026, 15:47:24
1class Solution {
2    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
3        if (a == e && !(c == a && d > Math.min(b, f) && d < Math.max(b, f))) {
4            return 1;
5        }
6        if (b == f && !(d == b && c > Math.min(a, e) && c < Math.max(a, e))) {
7            return 1;
8        }
9        if (Math.abs(c - e) == Math.abs(d - f)) {
10            if (Math.abs(c - a) == Math.abs(d - b) && Math.abs(a - e) == Math.abs(b - f)
11                && a > Math.min(c, e) && a < Math.max(c, e)
12                && b > Math.min(d, f) && b < Math.max(d, f)) {
13                return 2;
14            }
15            return 1;
16        }
17        return 2;
18    }
19}