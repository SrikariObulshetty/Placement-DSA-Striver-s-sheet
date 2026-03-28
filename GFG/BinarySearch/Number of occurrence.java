class Solution {
    
    
    int firstOcc(int arr[], int target,int len){
        int i=0;
        int j=len-1;
        int ans=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target){
                ans=mid;
                j=mid-1;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{ //arr[mid] < target
                i=mid+1;
            }
        }
        return ans;
        
    }
    
    int lastOcc(int arr[], int target,int len){
        int i=0;
        int j=len-1;
        int ans=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target){
                ans=mid;
                i=mid+1;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{ //arr[mid] < target
                i=mid+1;
            }
        }
        return ans;
        
    }
    int countFreq(int[] arr, int target) {
        // code here
        int len=arr.length;
        int first=firstOcc(arr,target,len);
        if(first==-1){ // target is not in array
            return 0;
        }
        int last=lastOcc(arr,target,len);
        return last-first+1;
        
        
    }
}
