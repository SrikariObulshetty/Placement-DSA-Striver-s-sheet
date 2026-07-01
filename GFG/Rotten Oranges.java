class Solution {
    
    class Pair{
        int r;
        int c;
        Pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    
    
    
    public int orangesRot(int[][] mat) {
        // code here.....
        int m = mat.length;
        int n = mat[0].length;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 2){
                    q.offer(new Pair(i,j));
                }
            }
        }
        
        int time =0;
        int [] dr = {-1,0,1,0};
        int [] dc = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int size = q.size();
            time++;
            while(size-- > 0){
                Pair p = q.poll();
                for(int i=0;i<=3;i++){
                    for(int j=0;j<=3;j++){
                        int r = p.r + dr[i];
                        int c = p.c + dc[i];  
                        if(r>=0 && r<m && c>=0 && c<n && mat[r][c]==1){
                            mat[r][c] =2;
                            q.offer(new Pair(r,c));
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    return -1;
                }
            }
        }
        return time==0?0 : time-1;
        
        
    }
}
