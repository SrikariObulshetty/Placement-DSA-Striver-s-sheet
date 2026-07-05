class Solution {
    
    
    public boolean dfs(List<List<Integer>>adj, int[] visited, int par, int node){
          
          for(int i=0;i<adj.get(node).size();i++){
               int t = adj.get(node).get(i);
               if(visited[t]==-1){
                   visited[t]= 1; 
                   if(dfs(adj, visited,node, t)){
                       return true;  
                   };  
               }
               else if(t!=par){
                   return true;
               }
               
          }
          return false;  
    }
    
    
    
    
    public boolean isCycle(int V, int[][] edges) {
        // Code here.....
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
        int [] visited = new int[V];
        Arrays.fill(visited, -1);
        int path[] = new int[V];
        Arrays.fill(path, -1);
        for(int i=0;i<V;i++){
            if(visited[i] == -1){
                visited[i] = 0; 
                if(dfs(adj, visited,-1, i)){  
                    return true;
                    
                }
            }
        }
        
        return false;
        
        
        
    }
}
