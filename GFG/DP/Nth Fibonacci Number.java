class Solution {
    
    public int fibo(int n, int dp[]){
        if(n<=1){
            dp[n] = n; 
        }
        else if(dp[n] == -1){ 
            dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
        }
        return dp[n]; 
    }
    
    
    
    public int nthFibonacci(int n) {
        // code here.....
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return fibo(n, dp);  
    }
}
