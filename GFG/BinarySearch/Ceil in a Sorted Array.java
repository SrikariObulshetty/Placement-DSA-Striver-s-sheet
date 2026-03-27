// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // BINARY SEARCH
        int i=0;
        int j=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>=x){
                ans=Math.min(ans, mid);
                j=mid-1;
            }
            else{ //arr[mid] < x
                i=mid+1;
            }
        }
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
}
TC:O(logN)
SC:O(1)
