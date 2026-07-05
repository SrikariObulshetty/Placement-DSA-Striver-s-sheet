class Solution {

   public boolean dfs(List<List<Integer>>adj, int[] visited, int[] path, int node){
        int s = adj.get(node).size();
        for(int i=0;i<s;i++){
            int t = adj.get(node).get(i);
            if(visited[t] == 0){
                visited[t] = 1;
                path[t] = 1;
                if(dfs(adj, visited, path, t)){
                    return true;
                }
                path[t] = 0;
            }
            else if(path[t] != 0){  
                return true; 
            }
        }
        return false; 
   }  


    public boolean canFinish(int V, int[][] pre) {
         // Using DFS.
         // create adjacency list.
         List<List<Integer>> adj = new ArrayList<>();
         for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
         }
         for(int i=0;i<pre.length;i++){
            adj.get(pre[i][1]).add(pre[i][0]);
         }
         int [] visited = new int[V];
         int [] path = new int[V]; // to check if they are visited on same path or not.
         for(int i=0;i<V;i++){
            if(visited[i] == 0){ 
                if(dfs(adj, visited, path, i)){
                    return false;
                }
            }
         }
         return true; 

        
    }
}
