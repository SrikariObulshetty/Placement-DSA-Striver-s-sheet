class Solution {

    
    public int maximumPoints(int mat[][]) {
        // code here.....
        int days = mat.length;
        int dp[][] = new int[days][4];
        // base cases
        dp[0][0] = mat[0][0];
        dp[0][1] = mat[0][1];
        dp[0][2] = mat[0][2];  
        for(int i=1;i<days;i++){ 
            for(int j=0;j<3;j++){
                int max = Integer.MIN_VALUE;
                for(int k=0;k<3;k++){
                    if(j!=k){
                        max=Math.max(max, mat[i][j] + dp[i-1][k]); 
                    }  
                     
                }
                dp[i][j]=max; 
                dp[i][3] = Math.max(dp[i][3], max);
                 
            } 
              
        }
        return dp[days-1][3]; 
        
    }
}
