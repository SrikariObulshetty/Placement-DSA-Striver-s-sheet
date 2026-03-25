class Solution {
    public int majorityElement(int[] nums) {
        int ele=0;
        int cnt=0;
        for(int n:nums){
            if(cnt==0){//we're starting with curr n
                 cnt++;
                 ele=n;
            }
            else if(n==ele){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return ele;
    }
}
TC:O(N)
SC:O(1)
