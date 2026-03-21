// User function Template for Java

class Solution {

    public boolean countSub(long arr[], long n) {
        // Your code goes here..
        for(int i=0;i<=n/2;i++){
            if( (2*i + 1) <n ){
                if(arr[i] < arr[2*i + 1]){
                    return false;
                }
            }
            if( (2*i + 2) < n ){
                if(arr[i] < arr[2*i + 2]){
                    return false;
                }
            }
        }
        return true;
    }
}
TC:O(N)
SC:O(N)
