class Solution {

    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int f = nums[0];
        int s = Math.max(nums[0], nums[1]);
        for(int i=2;i<n;i++){
           int t1 = nums[i] + f;
           int t2 = s;
           f = s;
           s = Math.max(t1, t2);
        }
        return s;   
    }
}
