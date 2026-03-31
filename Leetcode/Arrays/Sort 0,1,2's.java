class Solution {
    public void sortColors(int[] nums) {
        int l=nums.length;
        int i=0,k=l-1;
        int p=0;
        while(p<=k){
            if(nums[p]==2){ //swap with 'k' variables.
                int temp= nums[k];
                nums[k--] = nums[p];
                nums[p]=temp;
            }
            else if(nums[p]==1){
                p++;
                continue;
            }
            else{ // nums[i] = 0,swap with i variable.
                 int temp=nums[i];
                 nums[i++]=nums[p];
                 nums[p++]=temp;
            }
        }
    }
}
TC:O(N)
SC:O(1)
