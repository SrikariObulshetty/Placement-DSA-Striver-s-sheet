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
        int dp[][] = new int[mat.length][4];
        for(int i=0;i<mat.length;i++){
            Arrays.fill(dp[i], -1);
        }
        // dp[0][0] = mat[0][0];
        
        return memo(mat, 0, mat.length, 3,dp);
        
    }
}
