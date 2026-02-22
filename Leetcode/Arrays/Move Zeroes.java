class Solution {
    public void moveZeroes(int[] nums) {
         int l = nums.length;
         int i=0;
         int j=0;
         while(j<l){
            if(nums[j] == 0){
                j++;
                continue;
            }
            else{
                //swap
                int temp=nums[i];
                nums[i++]=nums[j];
                nums[j] = temp;   
            }
            j++;
         }
    }
}

TC:O(n)
SC:O(1)
