// Last updated: 09/07/2026, 15:07:44
class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n = grid[0].length;
        int ans =0;
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && vis[i][j] == false){
                    ans++;
                    bfs(i,j, vis, grid,m,n);
                }
            }
        }
        return ans;
    }

    public static void bfs(int i,int j,boolean[][] vis,char[][] grid,int m,int n){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        vis[i][j] = true;
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        while(q.size() > 0){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            for(int k=0;k<4;k++){
                int x2 = x+dir[k][0];
                int y2 = y+dir[k][1];
                if(x2 < m && x2 >= 0 && y2 < n && y2>=0 && grid[x2][y2] == '1' && vis[x2][y2] == false){
                    q.add(new int[]{x2,y2});
                    vis[x2][y2] = true;
                }
            }
        }
    }
}