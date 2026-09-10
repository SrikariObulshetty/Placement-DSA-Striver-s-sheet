class Solution {
    public int paths(int[][] grid,int r, int c, int cr, int cc){
        if(cr>=r || cc>=c || grid[cr][cc] == 1){
            return 0;
         }
         else if(cr == r-1 && cc==c-1){
            return 1;
         }
         int ryt = paths(grid, r,c, cr, cc+1);
         int down = paths(grid, r, c, cr+1, cc);
         return ryt + down;

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return paths(obstacleGrid, obstacleGrid.length, obstacleGrid[0].length, 0, 0);
    }
}
