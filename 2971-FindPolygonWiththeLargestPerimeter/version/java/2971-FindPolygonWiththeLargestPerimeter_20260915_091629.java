// Last updated: 15/09/2026, 09:16:29
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4        for (int i = 0; i < n; i++) {
5            for (int j = i + 1; j < n; j++) {
6                int temp = matrix[i][j];
7                matrix[i][j] = matrix[j][i];
8                matrix[j][i] = temp;
9            }
10        }
11        for (int i = 0; i < n; i++) {
12            for (int j = 0; j < n / 2; j++) {
13                int temp = matrix[i][j];
14                matrix[i][j] = matrix[i][n - 1 - j];
15                matrix[i][n - 1 - j] = temp;
16            }
17        }
18    }
19}