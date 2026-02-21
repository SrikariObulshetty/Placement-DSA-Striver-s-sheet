class Solution {
    public boolean check(int[] nums) {
        int i=0;
        int l=nums.length;
        while(i < l-1){
            if(nums[i] > nums[i+1]){
                // check for rotation,
                // check other nums first
                i++;
                while(i < l-1){
                    if(nums[i] > nums[i+1]){
                        return false;
                    }
                    i++;
                }
                if(nums[0] >= nums[i]){
                    return true;
                }
                else{ 
                      return false;
                }
            }
            i++;
        }
        return true;
    }
}
TC:O(n)
SC:O(1)
