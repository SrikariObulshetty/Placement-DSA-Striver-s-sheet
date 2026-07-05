class Solution {
    public boolean canFinish(int V, int[][] pre) {
        // Solving using topo sort
        //Step 1:Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int e = pre.length;
        // add indegree also for each vertext
        int []indegree = new int[V];
        for(int i=0;i<e;i++){
            adj.get(pre[i][1]).add(pre[i][0]);
            indegree[pre[i][0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        List<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            topo.add(node);
            for(int i=0;i<adj.get(node).size();i++){
                int t = adj.get(node).get(i);
                indegree[t]--;
                if(indegree[t] == 0){
                    q.add(t);
                }
            }
        }
        return topo.size() == V? true : false;  
    }
}
