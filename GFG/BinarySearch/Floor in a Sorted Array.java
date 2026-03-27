class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        //BINARY SEARCH
        int ans=-1;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]<=x){
                ans=Math.max(ans, mid);
                i=mid+1;
            }
            
            else{ //arr[mid]>x
                j=mid-1;
            }
        }
        return ans;
    }
}
TC:O(logN)
SC:O(1)
