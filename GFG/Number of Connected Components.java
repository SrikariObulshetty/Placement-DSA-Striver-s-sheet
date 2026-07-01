class Solution {
    void dfs(List<List<Integer>>adj, boolean []visited, int node){
         visited[node]=true;
         for(int j=0;j<adj.get(node).size();j++){
             int t = adj.get(node).get(j);
             if(!visited[t]){
                 dfs(adj, visited, t);
             }
         }
         return;
         
    }
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        // code here.....
        //prepare adj list first
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.size();i++){
            List<Integer>temp = edges.get(i); 
            adj.get(temp.get(0)).add(temp.get(1));
            adj.get(temp.get(1)).add(temp.get(0));
        }
        //System.out.println(adj);
        boolean [] visited  = new boolean[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                count++;
                dfs(adj, visited, i);
            }
        }
        
        return count; 
        
    }
}
