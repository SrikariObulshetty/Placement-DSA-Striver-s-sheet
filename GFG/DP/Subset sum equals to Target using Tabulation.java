class Solution {

    
    static boolean isSubsetSum(int arr[], int sum) {
        // code here.....
        int n = arr.length;
        boolean [][] dp = new boolean[n][sum+1]; 
        
        // Base cases...
        
        for(int i=0;i<n;i++){
            dp[i][0] = true;
        }
        if(sum >= arr[0]){
            dp[0][arr[0]] = true;
        }
        
        
        for(int i=1;i<n;i++){
            for(int t = 1;t<=sum;t++){
                
                
                dp[i][t] = dp[i-1][t] ; 
                if(t >= arr[i]){
                    dp[i][t] = dp[i][t] || dp[i-1][t-arr[i]];
                }
                
            } 
        }
        return dp[n-1][sum];
        
        
        
    }
}
