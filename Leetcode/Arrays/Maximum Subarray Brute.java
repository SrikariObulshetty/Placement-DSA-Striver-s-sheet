class Solution {
    public int sum(int arr[], int i, int j){
        int res=0;
        for(int k=i;k<=j;k++){
            res+=arr[k];
        }
        return res;
    } 

    public int maxSubArray(int[] nums) {
        //Naive approach - generate all sub arrays and find their sum...
        //How to generate sub arrays???
        int ans= Integer.MIN_VALUE;
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
}
TC:O(N^2)
SC:O(1)
