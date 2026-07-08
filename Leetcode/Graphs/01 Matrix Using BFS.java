class Solution {
    class Pair{
        int r;
        int c;
        Pair(int r , int c){
            this.r = r;
            this.c = c;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int ans[][] = new int[r][c];
        int visited[][] = new int[r][c];
        Queue<Pair> q = new LinkedList<>();
       
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 if(mat[i][j] == 0){
                    q.add(new Pair(i, j));
                    ans[i][j] = 0;
                    visited[i][j] = 1;
                 }
            }
        }
        int dist = 0;
        int dr[] = {-1, 0, 1, 0};
        int dc[] = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int s = q.size();
            while(s-- > 0){
                Pair p = q.poll();
                ans[p.r][p.c] = dist;
                for(int k=0;k<=3;k++){
                    int m = p.r + dr[k];
                    int n = p.c + dc[k];
                    if(m>=0 && m<r && n>=0 && n<c && visited[m][n]==0 && mat[m][n]!=0){
                        q.add(new Pair(m, n));
                        visited[m][n] = 1;  
                    }
                }
            }
            dist++;
            
        }
        return ans;


        
    }
}
