class Solution {

    public int rec(int n, int curr, int []dp){
        if(curr==n){
            return 1;
        }
        else if(curr >=n ){
            return 0;
        }
        else if(dp[curr] != -1){
            return dp[curr]; 
        } 
        int oneStep = rec(n, curr + 1, dp); 
        int twoStep = rec(n, curr + 2, dp); 
        dp[curr] = oneStep + twoStep;
        return dp[curr];  
    }
    public int climbStairs(int n) {
        int []dp = new int[n+1];
        Arrays.fill(dp, -1);
        return rec(n, 0, dp); 
        
    }  
}
