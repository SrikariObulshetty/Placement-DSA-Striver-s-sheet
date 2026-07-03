class Solution {
    
    
    public boolean bfs(List<List<Integer>>adj, int [] parent, int src){
        Queue<Integer> q = new LinkedList<>();
        parent[src] = src; 
        q.offer(src);  
        while(!q.isEmpty()){ 
            int node = q.poll();
            for(int i=0;i<adj.get(node).size();i++){
               int t = adj.get(node).get(i);
               if(parent[t] == -1){
                  parent[t] = node;
                  q.offer(t);
               }
               else if(t != parent[node]){
                   return true;
               }
            }
        }
        return false; 
    }
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        //create adjacency list
        int r = edges.length;
        for(int i=0;i<r;i++){
            if(edges[i][0] == edges[i][1]){ //single node cycle
                return true; 
            }
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        // Code here.....
        int [] parent = new int[V];
        Arrays.fill(parent, -1); 
        for(int i=0;i<V;i++){
           if(parent[i]==-1){
               if(bfs(adj, parent, i)){
                   return true;
               }
           }
        }
        return false; 
    }
}

