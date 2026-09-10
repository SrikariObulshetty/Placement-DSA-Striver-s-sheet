class Solution {
    
    public int paths(int[][] grid,int r, int c, int cr, int cc, int dp[][]){
        if(cr>=r || cc>=c || grid[cr][cc] == 1){
            return 0;
         }
         else if(cr == r-1 && cc==c-1){
            return 1;
         }
         if(dp[cr][cc] != 0){
            return dp[cr][cc];
         }
         int ryt = paths(grid, r,c, cr, cc+1,dp);
         int down = paths(grid, r, c, cr+1, cc,dp);
         dp[cr][cc] = ryt + down;
         return dp[cr][cc];  
    }
    

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        int dp[][] = new int[r][c];
        return paths(obstacleGrid, r , c , 0 , 0,dp); 
    }
}
