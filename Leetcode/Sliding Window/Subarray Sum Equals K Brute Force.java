class Solution {
    public int subarraySum(int[] nums, int k) {
        // Trying brute force
        int l = nums.length;
        int cnt=0;
        for(int i=0;i<l;i++){
            int sum=0;
            for(int j=i;j<l;j++){
                sum+=nums[j];
                if(sum==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
