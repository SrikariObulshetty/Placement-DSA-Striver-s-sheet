class Solution {

    public int calculate(int l, int h, int []nums){
        int f = nums[l];
        int s = Math.max(nums[l], nums[l+1]);
        for(int i = l+2;i<=h;i++){
            int curr = nums[i] + f;
            f = s;
            s = Math.max(curr, s);
        }
        return s;
    }


    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        else if(n==2){
            return Math.max(nums[0], nums[1]);
        }
        int rem_first = calculate(1, n-1, nums);
        int rem_last = calculate(0, n-2,nums);

        return Math.max(rem_first, rem_last);         
    }
}
