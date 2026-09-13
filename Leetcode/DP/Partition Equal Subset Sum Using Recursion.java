class Solution {

    public boolean check(int []nums, int idx, int target){
        if(target == 0){
            return true;
        }
        else if(idx >= nums.length-1){
            return nums[idx] == target;
        }

        boolean notTake = check(nums,idx+1, target);
        boolean take = false;
        if(nums[idx] <= target){
            take = check(nums, idx+1, target-nums[idx]);
        }

        return take || notTake;


    }
    public boolean canPartition(int[] nums) {
         int total = 0;
         for(int n:nums){
            total+=n;
         }
         if(total%2 != 0){
            return false;
         }
         return check(nums, 0, total/2); 
        
    }
}
