class Solution {

    
    static boolean isSubsetSum(int arr[], int sum) {
        // code here.....
        int n = arr.length;
        boolean [] dp = new boolean[sum+1]; 
        
        if(sum >= arr[0]){
            dp[arr[0]] = true; 
        }
        
        dp[0] = true; 
        
        for(int i=1;i<n;i++){
            boolean [] temp = new boolean[sum+1]; 
            temp[0] = true; // base case
            
            for(int t = 1;t<=sum;t++){ 
                temp[t] = dp[t] ; 
                if(t >= arr[i]){
                    temp[t] = temp[t] || dp[t-arr[i]]; 
                }
                
            } 
            
            dp = temp;
        } 
        return dp[sum];
        
        
        
    }
}
