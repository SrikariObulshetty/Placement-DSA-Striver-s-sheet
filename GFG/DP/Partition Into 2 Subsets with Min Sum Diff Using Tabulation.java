class Solution {
    public int minDifference(int nums[]) {
        // code here.....
        
        int total = 0;
                int n = nums.length;
                for(int k:nums){
                    total+=k;
                }

                boolean dp[][] = new boolean[n][total+1];
                // Base Cases
                for(int i=0; i<n;i++){
                    dp[i][0] = true;
                }
                if(nums[0] <= total && nums[0]>0){
                    dp[0][nums[0]] = true; // negatives exist , so, need to add the condition, o.w will get Array Indes out of bound exception
                }        


                for(int i=1;i<n;i++){
                    for(int j=1;j<=total;j++){
                        dp[i][j] = dp[i-1][j];
                        if( nums[i] <= j ){
                            dp[i][j] = dp[i][j] || dp[i-1][j - nums[i]];
                        }
                    }
                }
                // check for sums
                int ans = Integer.MAX_VALUE;
                for(int i=1;i<=total;i++){
                    if(dp[n-1][i]){
                        int diff = Math.abs(total- i - i); 
                        ans = Math.min(ans,diff); 
                    }
                }
                return ans;
        
    }
}
