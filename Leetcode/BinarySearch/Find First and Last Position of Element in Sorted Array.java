class Solution {

    int firstOcc(int nums[],int target){
        int i=0;
        int j=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                ans=Math.min(ans,mid);
                j=mid-1;
            }
            else if(nums[mid] > target){
                j=mid-1;
            }
            else{ //nums[mid] < target
                i=mid+1;
            }
        }
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
    int lastOcc(int nums[],int target){
        int i=0;
        int j=nums.length-1;
        int ans=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                ans=Math.max(ans,mid);
                i=mid+1;
            }
            else if(nums[mid] > target){
                j=mid-1;
            }
            else{ //nums[mid] < target
                i=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=firstOcc(nums,target);
        ans[1]=lastOcc(nums,target);
        return ans;

    }
}
