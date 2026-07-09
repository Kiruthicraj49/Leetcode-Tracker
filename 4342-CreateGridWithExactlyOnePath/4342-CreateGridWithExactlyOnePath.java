// Last updated: 09/07/2026, 15:05:06
class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        for(int i=0;i<m;i++){
            StringBuilder sb =new StringBuilder();
            for(int j=0;j<n;j++){
                if(j==0 || i==m-1){
                    sb.append('.');
                }
                else{
                    sb.append('#');
                }
            }
            grid[i] = sb.toString();
        }
        return grid;
    }
}