class Solution {
    class Pair{
        int r;
        int c;
        Pair(int r, int c){
            this.r=r;
            this.c=c;
        }
    }

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){ // rotten
                    q.offer(new Pair(i,j));
                }
            }
        }
        int time=0;
        int[] dr = {-1,0,+1,0};
        int[] dc = {0, +1, 0, -1};
        while(!q.isEmpty()){
            int size = q.size();
            time++; 
            while(size-->0){ 
                Pair p = q.poll();
                for(int i=0;i<=3;i++){
                    int r = p.r + dr[i];
                    int c = p.c + dc[i];
                    if(r>=0 && r<m && c>=0 && c<n && grid[r][c]==1){
                         grid[r][c]=2; 
                         q.offer(new Pair(r, c));
                    } 
                }
            }
           
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return -1;
                } 
            }
        }
        return time==0?0 : time-1;  
    }
}
