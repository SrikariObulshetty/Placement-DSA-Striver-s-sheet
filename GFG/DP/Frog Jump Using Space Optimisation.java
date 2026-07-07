class Solution {
    int minCost(int[] height) {
        // code here....
        int n = height.length;
        if(n==1){
            return 0;
        }
        int f = 0;
        int s = Math.abs( height[1] - height[0] );
        for(int i=2;i<n;i++){ 
            int one = s + Math.abs(height[i] - height[i-1]);
            int sec = f + Math.abs(height[i] - height[i-2]);
            int ans = Math.min(one, sec);
            f = s;
            s = ans;
        }
        return s;   
        
    }
}
