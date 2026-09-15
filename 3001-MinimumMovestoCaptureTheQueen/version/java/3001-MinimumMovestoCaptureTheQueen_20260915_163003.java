// Last updated: 15/09/2026, 16:30:03
1import java.util.ArrayList;
2import java.util.List;
3class Solution {
4    public List<Integer> spiralOrder(int[][] matrix) {
5        List<Integer> res = new ArrayList<>();
6        int top = 0, bottom = matrix.length - 1;
7        int left = 0, right = matrix[0].length - 1;
8        while (top <= bottom && left <= right) {
9            for (int j = left; j <= right; j++) res.add(matrix[top][j]);
10            top++;
11            for (int i = top; i <= bottom; i++) res.add(matrix[i][right]);
12            right--;
13            if (top <= bottom) {
14                for (int j = right; j >= left; j--) res.add(matrix[bottom][j]);
15                bottom--;
16            }
17            if (left <= right) {
18                for (int i = bottom; i >= top; i--) res.add(matrix[i][left]);
19                left++;
20            }
21        }
22        return res;
23    }
24}