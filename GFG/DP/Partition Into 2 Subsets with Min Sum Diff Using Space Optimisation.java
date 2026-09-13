class Solution {
    public int minDifference(int nums[]) {
        // code here.....
        
        int total = 0;
        int n = nums.length;
        for(int k:nums){
            total+=k;
        }

        boolean dp[] = new boolean[total+1];
        // Base Cases
        dp[0] = true;
        if(nums[0] <= total){
            dp[nums[0]] = true; // negatives exist , so, need to add the condition, o.w will get Array Indes out of bound exception
        }        

        // Subset sum equals target table creation. 
        for(int i=1;i<n;i++){
            boolean temp[] = new boolean[total + 1];
            for(int j=1;j<=total;j++){
                temp[j] = dp[j];
                if( nums[i] <= j ){
                    temp[j] = dp[j] || dp[j - nums[i]];
                }  
            }
            dp = temp;
        }
        
        // check for sums
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<=total/2;i++){  // No need to check for full sums, since after half those will be repeated.
            if(dp[i]){
                int diff = Math.abs(total- i - i); 
                    ans = Math.min(ans,diff); 
            } 
        }
        
        return ans;
        
    }
}
