class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
       
        if(obstacleGrid[0][0] == 1){
            return 0; 
        }
        int dp[] = new int[c];

        for(int i=0;i<r;i++){

            int temp[] = new int[c];

            for(int j=0;j<c;j++){
                if(i==0 && j==0){
                   temp[0] = 1; // one way to reach (0,0)
                   continue; 
                }
                else if(obstacleGrid[i][j] == 1){
                    temp[j] = 0; 
                    continue;
                }
                int left = 0;
                int up = 0;
                if(i>0){
                    up = dp[j];
                } 
                if(j>0){
                   left = temp[j-1];
                }
               temp[j]=  up + left;
            }

            dp = temp;
        }

        return dp[c-1]; 
    }
}
