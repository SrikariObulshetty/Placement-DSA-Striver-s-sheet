class Solution {
    public int[] leftRightDifference(int[] nums) {
        //prefix sum
        int l = nums.length;
        int ans[] = new int[l];
        int totalSum=0;
        for(int n:nums){
            totalSum+=n;
        }
        int prefix=0;
        for(int i=0;i<l;i++){
            totalSum-=nums[i]; 
            ans[i] = Math.abs(prefix - totalSum);
            prefix+=nums[i];
        }
        return ans;
    }
}
