class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int l=nums.length;
        for(int n:nums){
           map.put(n, map.getOrDefault(n,0) + 1);
        }
        for(Integer m:map.keySet()){
            if(map.get(m) > l/2){
                return m;
            }
        }
        return -1;
    }
}
TC:O(N)
SC:O(N)
