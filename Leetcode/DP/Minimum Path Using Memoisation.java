class Solution {

    public long min_cost(int [][] grid, int r, int c, int cr, int cc, long [][] dp){
        if(cr>=r || cc>=c ){
            return Integer.MAX_VALUE;
        }
        else if(cr==r-1 && cc==c-1){
            return grid[cr][cc];
        }
        else if(dp[cr][cc] != 0){
            return dp[cr][cc];
        }
        long ryt = grid[cr][cc] + min_cost(grid, r, c, cr, cc+1,dp);
        long down = grid[cr][cc] + min_cost(grid, r, c, cr+1, cc,dp);
        dp[cr][cc] = Math.min(ryt,down);
        return dp[cr][cc]; 
    }

    public int minPathSum(int[][] grid) {
        int r = grid.length; 
        int c = grid[0].length;
        long dp[][] = new long[r][c];
        return (int)min_cost(grid, r, c, 0, 0, dp); 
    }
}
