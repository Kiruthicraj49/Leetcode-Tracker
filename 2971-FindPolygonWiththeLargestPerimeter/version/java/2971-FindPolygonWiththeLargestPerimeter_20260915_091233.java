// Last updated: 15/09/2026, 09:12:33
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        int maxLen = 1;
4        int inc = 1; 
5        int dec = 1; 
6        for (int i = 1; i < arr.length; i++) {
7            if (arr[i] > arr[i - 1]) {
8                inc = dec + 1;
9                dec = 1;
10            } else if (arr[i] < arr[i - 1]) {
11                dec = inc + 1;
12                inc = 1;
13            } else {
14                inc = 1;
15                dec = 1;
16            }
17            maxLen = Math.max(maxLen, Math.max(inc, dec));
18        }
19        return maxLen;
20    }
21}