class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        int j=0;
        for(int i=0;i<l;i++){
            if(nums[i]!=nums[j]){
                //swap
                nums[++j]=nums[i];
            }
        }
        return j+1;
    }
}

TC:O(n)
SC:O(1)
