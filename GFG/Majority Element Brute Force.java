class Solution {
    int majorityElement(int arr[]) {
        // code here
        int l=arr.length;
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int n:arr){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        for(int key: map.keySet()){
            if(map.get(key) > l/2){
                return key;
            }
        }
        return -1;
    }
}
TC:O(N)
SC:O(N)
