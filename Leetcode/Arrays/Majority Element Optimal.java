class Solution {
    public int majorityElement(int[] nums) {
        int n = nums[0];
        int l=nums.length;
        int count=1;
        for(int i=1;i<l;i++){
            if(count==0){
                n=nums[i];
                count++;
                continue;
            }
            if(nums[i] == n){
                count++;
            }
            else{
                count--;
            }
        }
        return n;
    }
}
TC:O(N)
SC:O(1)
