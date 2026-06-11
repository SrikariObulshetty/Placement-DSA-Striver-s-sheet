class Solution {
    public boolean check(int nums[], int idx){
        if(idx>=nums.length-1){
            return true;
        }
        else if(nums[idx]==0){ 
            return false;
        }
        for(int j=1;j<=nums[idx];j++){
            if(check(nums, idx+j)){ 
                return true;
            }
        }
        return false;
    } 
    
    public boolean canJump(int[] nums) {
        int l = nums.length; 
        return check(nums, 0); 
    }
}
