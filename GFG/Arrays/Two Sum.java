class Solution {
    boolean twoSum(int arr[], int target) {
        // code here.
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(target - arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
TC:O(N)
SC:O(N)
