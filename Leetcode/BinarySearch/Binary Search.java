class Solution {
    public int search(int[] nums, int target) {
         int l=nums.length;
         int i=0;
         int j=l-1;
         while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid] > target){
                j=mid-1;
            }
            else{ // nums[mid]<target
               i=mid+1;
            }
         }
         return -1;
    }
}
