class Solution {
    int search(int[] arr, int target) {
        // code here
        int len=arr.length;
        int l=0;
        int r=len-1;
        while(l<=r){
           int mid=(l+r)/2;
           if(arr[mid]==target){
               return mid;
           }
           else if(arr[l]<=arr[mid]){ //left part is completely sorted
              if(arr[l]<=target && target<=arr[mid]){ //target will be found left side if present
                  r=mid-1;
              }
              else{ // target will be found right side if present
                  l=mid+1;
              }
           }
           else{ //arr[mid]<=arr[r]
               if(arr[mid]<=target && target<=arr[r]){ //target will be found right side if present
                  l=mid+1;
              }
              else{ // target will be found left side if present
                  r=mid-1;
              }
           }
        }
        return -1;
    }
}
