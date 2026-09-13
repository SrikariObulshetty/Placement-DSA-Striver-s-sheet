class Solution {

    
    public boolean canPartition(int[] nums) {
         int total = 0;
         int n = nums.length;
         for(int k:nums){
            total+=k; 
         }
         if(total%2 != 0){
            return false;
         }
         int target = total / 2;
         boolean dp[][] = new boolean[n][target + 1];
         // Base Cases
         for(int i=0;i<n;i++){
            dp[i][0] = true; 
         }
         
         if(nums[0] <= target){
            dp[0][nums[0]] = true; // coz we can make sum nums[0] using element at 0th idx which is nums[0]
         }
         
        
         for(int i=1;i<n;i++){
            for(int j=1;j<=target;j++){
                dp[i][j] = dp[i-1][j]; 
                if(nums[i] <= j){ 
                    dp[i][j] = dp[i][j] || dp[i-1][j - nums[i]]; 
                }
            }
         }
         return dp[n-1][target];  
        
    }
}
