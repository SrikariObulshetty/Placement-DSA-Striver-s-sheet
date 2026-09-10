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
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 && j==0){
                    dp[0][0] = grid[0][0]; 
                    continue;
                }
                long left = Integer.MAX_VALUE;
                long up = Integer.MAX_VALUE;

                if(i>0){  
                    up = grid[i][j] + dp[i-1][j]; 
                }

                if(j > 0){
                    left = grid[i][j] + dp[i][j-1]; 
                }

                dp[i][j] = Math.min(up, left); 
            }
        }
        return (int)dp[r-1][c-1];  
    }
}
