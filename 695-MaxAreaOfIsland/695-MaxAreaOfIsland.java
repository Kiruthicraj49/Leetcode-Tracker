// Last updated: 09/07/2026, 15:06:49
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n = grid[0].length;
        int maxArea=0;
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1 && vis[i][j] == false){
                    maxArea  = Math.max(maxArea,bfs(i,j, vis, grid,m,n));
                }
            }
        }
        return maxArea;
    }
    public static int bfs(int i,int j,boolean[][] vis,int[][] grid,int m,int n){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        vis[i][j] = true;
        int area=0;
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        while(q.size() > 0){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            area++ ;
            for(int k=0;k<4;k++){
                int x2 = x+dir[k][0];
                int y2 = y+dir[k][1];
                if(x2 < m && x2 >= 0 && y2 < n && y2>=0 && grid[x2][y2] == 1 && vis[x2][y2] == false){
                    q.add(new int[]{x2,y2});
                    vis[x2][y2] = true;
                }
            }
        }
        return area;
    }
}