class Solution {
    int floorSqrt(int n) {
        // code here.....
        int i=1;
        for(;i*i<=n;i++){
            if(i*i ==n){
                return i;
            }
        }
        return i-1;
    }
}
