class Solution {

    
    public int maximumPoints(int mat[][]) {
        // code here.....
        int days = mat.length;
        int dp[] = new int[4];
        // base cases
        dp[0] = mat[0][0];
        dp[1] = mat[0][1];
        dp[2] = mat[0][2];  
        for(int i=1;i<days;i++){ 
            int temp[] = new int[4];
            for(int j=0;j<3;j++){
                int max = Integer.MIN_VALUE;
                
                for(int k=0;k<3;k++){
                    if(j!=k){
                        max=Math.max(max, mat[i][j] + dp[k]); 
                    }  
                     
                }
                temp[j] = max; 
                dp[3] = Math.max(dp[3], max); 
                 
            } 
            for(int k=0;k<3;k++){
                dp[k] = temp[k]; 
            } 
        }
        return dp[3]; 
        
    }
}
