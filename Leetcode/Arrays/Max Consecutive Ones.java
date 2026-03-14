class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int l = nums.length;
        int i=0;
        int j=0;
        for(;j<l;j++){
            if(nums[j]==1){
                continue;
            }
            max = Math.max(max, j-i);
            i=j+1;
        }
        max = Math.max(max, j-i);
        return max;
    }
}
