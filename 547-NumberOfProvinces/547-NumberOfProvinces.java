// Last updated: 09/07/2026, 15:06:53
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        boolean[] vis = new boolean[v];
        int count = 0;
        for (int i = 0; i < v; i++) {
            if (vis[i] == false) {
                count++;
                bfs(i, isConnected, v, vis);
            }
        }
        return count;
    }

    public static void bfs(int sv, int[][] isConnected, int v, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        vis[sv] = true;
        int m = isConnected.length;
        while (q.size() > 0) {
            int curr = q.poll();
            for (int i = 0; i < v; i++) {
                if (isConnected[curr][i] == 1 && vis[i] == false) {
                    q.add(i);
                    vis[i] = true;
                }
            }
        }
    }
}