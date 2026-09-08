class Solution {
    
    
    public int memo(int mat[][], int day, int days, int prev, int[][] dp){
        if(day >= days){
            return 0;
        }
        if(dp[day][prev] != -1){
            return dp[day][prev];
        }
        
        int sum =  Integer.MIN_VALUE;
        for(int i = 0; i<3; i++){
            if(i!=prev){ 
                sum = Math.max(sum, mat[day][i] + memo(mat, day+1, days, i,dp)); 
            }
            
        } 
        dp[day][prev] = sum;
        return sum;  
    } 
    
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
