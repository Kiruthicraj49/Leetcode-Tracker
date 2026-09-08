// Last updated: 08/09/2026, 09:02:35
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3        int max=0;
4        int maxarea=0;
5        for(int[] rect:dimensions){
6            int l=rect[0];
7            int w=rect[1];
8            int diag = l*l + w*w;
9            int area = l*w;
10            if(diag > max){
11                max = diag;
12                maxarea=area;
13            }
14            else if(diag == max){
15                maxarea = Math.max(maxarea,area);
16            }
17        }
18        return maxarea;
19    }
20}