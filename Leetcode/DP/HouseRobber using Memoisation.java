class Solution {

    public int rec(int idx, int nums[], int dp[]){
        if(idx < 0){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int pick = nums[idx] + rec(idx-2, nums, dp);
        int not_pick = rec(idx-1, nums, dp);
        dp[idx] = Math.max(pick, not_pick);
        return dp[idx]; 
    }
    
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1); 
        return rec(n-1, nums, dp);    
    }
}
