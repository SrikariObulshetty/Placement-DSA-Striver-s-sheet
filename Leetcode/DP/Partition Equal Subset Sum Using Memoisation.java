class Solution {

    public boolean check(int []nums, int idx, int target, int dp[][]){
        if(target == 0){
            return true;
        }
        else if(idx >= nums.length-1){
            return nums[idx] == target;
        }
        else if(dp[idx][target] != -1){
            return dp[idx][target] == 0? false : true;
        } 
        boolean notTake = check(nums,idx+1, target,dp);
        boolean take = false;
        if(nums[idx] <= target){
            take = check(nums, idx+1, target-nums[idx],dp); 
        }
        dp[idx][target] = (take || notTake) ? 1 : 0;
        return take || notTake; 


    }
    public boolean canPartition(int[] nums) {
         int total = 0;
         int n = nums.length;
         for(int k:nums){
            total+=k; 
         }
         if(total%2 != 0){
            return false;
         }
         int dp[][] = new int[n][total/2 + 1];
         for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1); 
         }
         return check(nums, 0, total/2, dp); 
        
    }
}
