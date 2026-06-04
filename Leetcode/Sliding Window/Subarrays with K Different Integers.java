class Solution {

    public int atmostK(int nums[], int k){
        int cnt=0;
        int i=0;
        int j=0;
        int l=nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        while(j<l){
            map.put(nums[j], map.getOrDefault(nums[j],0) + 1);
            if(map.size() <= k){
                cnt+=j-i+1; // not missing subarrays in between.
            }
            else{
                while(map.size() > k){
                    int freq = map.getOrDefault(nums[i],0); 
                    map.put(nums[i], freq-1); 
                    if(map.get(nums[i]) == 0){
                        map.remove(nums[i]);
                    }
                    i++;
                }
                cnt+=j-i+1;
            }
            j++; 
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostK(nums, k) - atmostK(nums,k-1);

    }
}
