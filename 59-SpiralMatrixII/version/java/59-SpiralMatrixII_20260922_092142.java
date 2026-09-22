// Last updated: 22/09/2026, 09:21:42
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
5        int r = 0, c = 0, d = 0;
6        for (int val = 1; val <= n * n; val++) {
7            matrix[r][c] = val;
8            int nr = r + dirs[d][0];
9            int nc = c + dirs[d][1];
10            if (nr < 0 || nr >= n || nc < 0 || nc >= n || matrix[nr][nc] != 0) {
11                d = (d + 1) % 4;
12                nr = r + dirs[d][0];
13                nc = c + dirs[d][1];
14            }
15            r = nr;
16            c = nc;
17        }
18        return matrix;
19    }
20}