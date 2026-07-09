// Last updated: 09/07/2026, 15:06:46
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[1].length-1;j++){
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}