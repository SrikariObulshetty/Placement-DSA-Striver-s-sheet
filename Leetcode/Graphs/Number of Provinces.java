class Solution {
    int count = 0;


    public void dfs(List<List<Integer>>adj, boolean []visited, int node){
         if(visited[node]==true){
            return;
         }
         visited[node]= true;
         for(int j=0;j<adj.get(node).size();j++){
            int curr = adj.get(node).get(j);
            if(!visited[curr] ){  
                dfs(adj, visited, curr); 
            }
         }
    } 

    public int findCircleNum(int[][] isConnected) {
         //create a adjacency list first
         List<List<Integer>> adj = new ArrayList<>();
         int n = isConnected.length;
         for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>()); 
         }

         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){ 
                if(isConnected[i][j]==1 && i!=j){
                   adj.get(i+1).add(j+1);    
                   //adj.get(j+1).add(i+1);
                } 
            }
         }
         // System.out.println(adj);

         boolean[] visited = new boolean[n+1]; 
         for(int i=1;i<=n;i++){
            if(!visited[i]){ 
                count++;
                dfs(adj,visited, i);
            }
         }
         return count;
          
        
    }
}
