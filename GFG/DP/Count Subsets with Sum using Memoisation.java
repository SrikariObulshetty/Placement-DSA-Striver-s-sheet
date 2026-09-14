class Solution {
    
    
    static int count(int arr[], int target, int idx, int dp[][]){
        // base Cases
        if(idx >= arr.length){
            if(target == 0){
                return 1;
            }
            return 0;
           
        }
        if(dp[idx][target] != -1){
            return dp[idx][target];
        }
        
        int notTake = count(arr, target, idx+1,dp);
        int take = 0 ;
        
        if(arr[idx] <= target){
            take = count(arr,target - arr[idx], idx+1,dp);
        }
        
        dp[idx][target] = take + notTake;
        
        return take + notTake;
    }
    static int perfectSum(int[] arr, int target) {
        // code here.....
        int n = arr.length;
        int dp[][] = new int[n][target + 1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        return count(arr, target, 0, dp);
        
    }
}
