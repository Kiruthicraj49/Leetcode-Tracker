// Last updated: 09/07/2026, 15:06:15
class Solution {
    public int diagonalSum(int[][] mat) {
    //     int sum=0;
    //     int n=mat.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(i==j || (i+j)==n-1){
    //                 sum=sum+mat[i][j];
    //             }
    //         }
    //     }
    //     return sum;
        int sum=0;
        int n=mat.length;
        int i=0;
        int j=0;
        for(int k=1;k<=n;k++){
            sum=sum+mat[i][j];
            i++;
            j++;
        }
        i=0;j=n-1;
        for(int k=1;k<=n;k++){
            if(i!=j){
                sum=sum+mat[i][j];
            }
            i++;
            j--;
        }
        return sum;
    }
}