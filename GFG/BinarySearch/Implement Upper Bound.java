class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        //APPn OF BINARY SEARCH
        int i=0;
        int j=arr.length-1;
        int ans=j+1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]<=target){
                i=mid+1;
            }
            else{ // arr[mid] > target
                ans=Math.min(ans,mid);
                j=mid-1;
            }
        }
        return ans;
        
    }
}
