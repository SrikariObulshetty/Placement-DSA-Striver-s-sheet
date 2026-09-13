class Solution {
    
    static boolean fun(int []arr, int target, int idx, int[][] dp){
        if(target == 0){
            return true;
        }
        if(idx == arr.length-1){
            return arr[arr.length-1] == target;
        }
        if(dp[idx][target] != -1){ 
            if(dp[idx][target] == 0){
                return false; 
            }
            return true;
        }
        boolean notTake = fun(arr, target, idx+1, dp);
        boolean take = false;
        if(target >= arr[idx]){
            take = fun(arr, target - arr[idx], idx+1, dp);
        }
        if(notTake || take){
            dp[idx][target] = 1;
        }
        dp[idx][target] = 0;
        
        return take || notTake;
        
    }
    
    
    
    static boolean isSubsetSum(int arr[], int sum) {
        // code here.....
        int n = arr.length;
        int [][] dp = new int[n][sum+1]; 
        
        for(int i=0;i<n;i++){ 
            Arrays.fill(dp[i], -1); 
        }
        
        return fun(arr, sum, 0, dp);
        
    }
}
