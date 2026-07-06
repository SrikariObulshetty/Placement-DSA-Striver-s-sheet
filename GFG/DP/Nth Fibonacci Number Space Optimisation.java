class Solution {
    public int nthFibonacci(int n) {
        // code here - DP Tabulation.
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int f = 0;
        int s = 1;
        int ans = 0;
        for(int i=2;i<=n;i++){
            ans = f + s;
            f = s;
            s = ans;  
        }
        return ans; 
    }
}

