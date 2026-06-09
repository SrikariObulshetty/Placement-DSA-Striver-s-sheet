class Solution {

    public int count(int []nums, int k){
        if(k<0){
            return 0;
        }
        int n=nums.length;
        int odds=0;
        int ans=0;
        int l=0,r=0;
        while(r < n){
           if(nums[r]%2 != 0){
              odds++;
           }
           while(odds > k){
              if(nums[l] % 2 !=0){
                  odds--;
              } 
              l++;
            }
            ans+= r-l+1; 
            r++;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        //count k = count of atmost k - countof atmost k-1 logic.
        return count(nums,k) - count(nums,k-1);
    }
}
