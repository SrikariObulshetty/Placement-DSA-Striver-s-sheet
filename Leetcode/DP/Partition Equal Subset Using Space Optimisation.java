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
         boolean dp[] = new boolean[target + 1];
         // Base Cases 
         if(nums[0] <= target){
            dp[nums[0]] = true; // coz we can make sum nums[0] using element at 0th idx which is nums[0]
         } 
         dp[0] = true; 
         
        
         for(int i=1;i<n;i++){
            boolean temp [] = new boolean[target+1];
            temp[0] = true;
            for(int j=1;j<=target;j++){
                temp[j] = dp[j]; 
                if(nums[i] <= j){ 
                    temp[j] = dp[j] || dp[j - nums[i]]; 
                }
            }
            dp = temp;
         } 
         return dp[target];  
        
    }
}
