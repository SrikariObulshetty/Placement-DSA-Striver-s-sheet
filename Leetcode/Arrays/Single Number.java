class Solution {
    public int singleNumber(int[] nums) {
         int xor =0;
         int l =nums.length;
         for(int i=0;i<l;i++){
            xor = xor ^ nums[i];
         }
         return xor;
    }
}
