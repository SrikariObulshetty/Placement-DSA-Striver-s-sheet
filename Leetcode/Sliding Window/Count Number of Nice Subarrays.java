class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        //Brute Force - Generate all subarrays
         int l = nums.length;
         int ans=0;
         for(int i=0;i<l;i++){
            int odds=0;
            for(int j=i;j<l;j++){
                if(nums[j]%2 != 0){
                    odds++;
                }
                if(j-i+1 >= k){
                    if(odds == k){
                        ans++; 
                    }
                    else if(odds > k){
                        break;
                    }
                }
            }
         }
         return ans;
    }
}
