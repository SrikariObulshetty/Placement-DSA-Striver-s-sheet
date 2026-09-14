class Solution {
    
    
  
    static int perfectSum(int[] arr, int target) {
        // code here.....
        int n = arr.length;
        int dp[][] = new int[n][target + 1];
        
        for(int i=0;i<n;i++){
            dp[i][0] = 1;
            
        }
        
        if(arr[0] <= target){ 
            dp[0][arr[0]] += 1;  // I did not get this case to add one, I thought dp[0][arr[0]] = 1;, which goes wrong if target is 0
        } 
        
        
        for(int i=1;i<n;i++){
            for(int j=0;j<=target;j++){ 
                
               dp[i][j] = dp[i-1][j];
                
                if(arr[i] <= j){ 
                    dp[i][j] += dp[i-1][j - arr[i]];
                    
                }
                
            }
        }
        
        
        return dp[n-1][target];
        
    }
}
