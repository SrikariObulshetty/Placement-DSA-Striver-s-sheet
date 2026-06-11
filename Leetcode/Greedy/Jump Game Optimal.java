class Solution {
    public boolean canJump(int[] nums) {
        int l = nums.length;
        int maxLen = 0;
        for(int i=0;i<=maxLen;i++){
            maxLen = Math.max(maxLen, i+nums[i]);
            if(maxLen >= l-1){
                return true;
            }
        }
        return false; 
    }
}
