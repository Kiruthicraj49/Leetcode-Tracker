// Last updated: 09/07/2026, 15:06:04
class Solution {
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int m = edges.length;
        for(int i=0;i<m;i++){
            int sv = edges[i][0];
            int ev = edges[i][1];
            adj.get(sv).add(ev);
            adj.get(ev).add(sv);
        }
        return bfs(n,adj,source,destination);
    }
    public boolean bfs(int n, List<List<Integer>> adj,int source, int destination) {
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        vis[source] = true;
        while(q.size() > 0){
            int node = q.poll();
            if (node == destination) {
                return true;
            }
            int mn= adj.get(node).size();
            for(int i=0;i<mn;i++){
                int x = adj.get(node).get(i);
                if(vis[x]==false){
                    q.add(x);
                    vis[x] = true;
                }
            }
        }
        return false;
    }
}