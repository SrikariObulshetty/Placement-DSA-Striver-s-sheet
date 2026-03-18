class Solution {
    public int searchInsert(int[] nums, int target) {
        //BINARY SEARCH
         int i=0;
         int j=nums.length-1;
         while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{ // nums[mid] > target
               j=mid-1;
            }
         }
         
         return i;

    }
}
TC:O(logN)
SC:O(1)
