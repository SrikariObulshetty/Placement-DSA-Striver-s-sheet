class Solution {
    
    
    static int count(int arr[], int target, int idx){
        // base Cases
        if(idx >= arr.length){
            if(target == 0){
                return 1;
            }
            return 0;
           
        }
        
        int notTake = count(arr, target, idx+1);
        int take = count(arr,target - arr[idx], idx+1);
        
        return take + notTake;
    }
    static int perfectSum(int[] arr, int target) {
        // code here.....
        return count(arr, target, 0);
        
    }
}
