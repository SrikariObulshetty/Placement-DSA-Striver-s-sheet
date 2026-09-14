class Solution {
    
    
    static int perfectSum(int[] arr, int target) {
        // code here.....
        int n = arr.length;
        int dp[] = new int[target + 1];
        dp[0] = 1;
        
        if(arr[0] <= target){ 
            dp[arr[0]] += 1;  // I did not get this case to add one, I thought dp[0][arr[0]] = 1;, which goes wrong if target is 0
        } 
        
        
        for(int i=1;i<n;i++){
            int temp[] = new int[target + 1];
            temp[0] = 1;
            for(int j=0;j<=target;j++){ 
                
               temp[j] = dp[j];
                
                if(arr[i] <= j){ 
                    temp[j] += dp[j - arr[i]];
                    
                }
                
            }
            
            dp = temp;
        }
        
        
        return dp[target];
        
    }
}
