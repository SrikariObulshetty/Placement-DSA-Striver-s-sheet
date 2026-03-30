class Solution {
    public boolean search(int[] nums, int target) {
         int len=nums.length;
         int low=0;
         int high=len-1;
         while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) return true;
            if(nums[mid]==nums[low]) low++;
            else if(nums[low]<=nums[mid]){ //left part is sorted 
               if(nums[low]<=target && target<=nums[mid]){ //if target is present,it will be on left side
                   high=mid-1;
               }
               else{ //on right side
                  low=mid+1;
               }
            }
            else{
                if(nums[mid]<=target && target<=nums[high]){ //if target is present,it will be on right side
                   low=mid+1;
               }
               else{ //on left side
                  high=mid-1;  
               }
            }
         }
         return false;
    }
}
