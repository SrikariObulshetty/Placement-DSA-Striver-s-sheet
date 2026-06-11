class Solution {
    
    public boolean check(int nums[], int idx, boolean [] memo){
        if(idx>=nums.length-1){
            return true;
        }
        else if(nums[idx]==0){ 
            return false;
        }
        for(int j=1;j<=nums[idx];j++){
            if(memo[j+idx]!=true){
                if(check(nums, idx+j, memo)){ 
                   return true;
                }
                memo[j+idx]=true;
            }  
        }
        return false;
    } 

    public boolean canJump(int[] nums) {
        boolean memo[] = new boolean[nums.length];
        return check(nums, 0,memo); 
    }
}
