class Solution {

    public int minPathSum(int[][] grid) {
        int r = grid.length; 
        int c = grid[0].length;
        long dp[] = new long[c];  
        for(int i=0;i<r;i++){
            long temp[] = new long[c]; 
            for(int j=0;j<c;j++){ 
                if(i==0 && j==0){ 
                    temp[0] = grid[0][0];  
                    continue; 
                }

                long left = Integer.MAX_VALUE; 
                long up = Integer.MAX_VALUE; 

                if(i > 0){
                    up = grid[i][j] + dp[j];
                }

                if(j > 0){  
                    left = grid[i][j] + temp[j-1];  
                }

                temp[j] = Math.min(up, left); 
            }
            dp = temp;
        }
        return (int)dp[c-1];  
    }
}
