class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here..
        int l=0,h=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid] == k){
                ans=Math.min(ans, mid);
                h=mid-1;
            }
            else if(arr[mid] < k){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans; 
        
    }
}
TC:O(logN)
SC:O(1)
