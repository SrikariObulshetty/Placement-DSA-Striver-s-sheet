class Solution {
    
    public int memo(int[] height, int n, int[] dp, int idx){
          if(idx == n-1){
              return 0;  
          }  
          else if(dp[idx] != -1){
              return dp[idx];
          }
          
          int os = Math.abs(height[idx] - height[idx+1]) + memo(height, n, dp, idx+1);
          int ts = Integer.MAX_VALUE;
          if(idx + 2 <= n-1){ 
              ts = Math.abs( height[idx] - height[idx+2] ) + memo(height, n, dp, idx+2);  
          }
          dp[idx] = Math.min(os, ts);  
          return dp[idx];
      
        
        
    }
    
    
    int minCost(int[] height) { 
        // code here.....
        int n = height.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1); 
        memo(height, n, dp, 0);
        return dp[n-1]; 
        
    }
}
