class Solution {
    
    static boolean fun(int []arr, int target, int idx){
        if(target == 0){
            return true;
        }
        if(idx == arr.length-1){
            return arr[arr.length-1] == target;
        }
        boolean notTake = fun(arr, target, idx+1);
        if(notTake){
            return true; 
        }
        boolean take = false;
        if(target >= arr[idx]){
            take = fun(arr, target - arr[idx], idx+1);
        }
        return notTake || take; 
        
    }
    
    
    
    static boolean isSubsetSum(int arr[], int sum) {
        // code here.....
        return fun(arr, sum, 0);
        
    }
}
