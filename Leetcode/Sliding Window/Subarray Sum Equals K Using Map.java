class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        int l = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0, 1); //DONT FORGET TO ADD THIS, bcoz of this all test cases failed.
        int sum = 0;
        for(int i=0;i<l;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                int f = map.get(sum-k);
                ans+=f;
            }
            map.put(sum, map.getOrDefault(sum,0) + 1);

        }
        return ans;    
    }
}
