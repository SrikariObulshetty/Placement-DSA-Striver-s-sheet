class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int l=nums.length;
        int zeros=0;
        int i=0;
        for(int j=0;j<l;j++){
            if(nums[j]==0){
                zeros++;
            }
            while(zeros > k){
                if(nums[i]==0){
                    zeros--;
                }
                i++;
            }
            max=Math.max(max, j-i+1);
        }
        return max;
        
    }
}
