class Solution {

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
