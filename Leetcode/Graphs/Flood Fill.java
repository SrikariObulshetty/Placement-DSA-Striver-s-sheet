class Solution {
    class Pair{
        int r;
        int c;
        Pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //BFS TRAVERSAL
        int m = image.length;
        int n = image[0].length;
        int [] dr = {-1, 0, 1, 0};
        int [] dc = {0, 1, 0, -1}; 
        boolean visited[][] = new boolean[m][n];  
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(sr, sc));
        visited[sr][sc] = true;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){ 
                Pair p = q.poll();
                int col = image[p.r][p.c];
             
                image[p.r][p.c] = color; 
                for(int i=0;i<=3;i++){
                   int r = p.r + dr[i];
                   int c = p.c + dc[i];
                   if(r>=0 && r<m && c>=0 && c<n && image[r][c] == col && !visited[r][c]){
                       q.offer(new Pair(r,c)); 
                        visited[p.r][p.c] = true;
                   }
                }
            }
        } 
        return image;
        
    }
}
