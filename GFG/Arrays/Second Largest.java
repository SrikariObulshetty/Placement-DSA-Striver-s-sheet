TC:O(n)
SC:O(1)

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here.
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int n:arr){
            if(max < n){
                smax=max;
                max=n;
            }
            else if(smax < n && n!=max){
                smax= n;
            }
        }
        if(smax == Integer.MIN_VALUE){ // NO second maximum.
            return -1;
        }
        return smax;
    }
}
