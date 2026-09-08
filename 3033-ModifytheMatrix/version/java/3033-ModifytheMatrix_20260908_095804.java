// Last updated: 08/09/2026, 09:58:04
1class Solution {
2    public int[][] modifiedMatrix(int[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        for(int col=0;col<n;col++){
6            int max= -1;
7            for(int row=0;row<m;row++){
8                max=Math.max(max,matrix[row][col]);
9            }
10            for(int row=0;row<m;row++){
11                if(matrix[row][col] == -1){
12                    matrix[row][col] = max;
13                }
14            }
15        }
16        return matrix;
17    }
18}