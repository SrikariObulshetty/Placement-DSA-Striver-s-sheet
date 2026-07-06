class Solution {
    
    
    public int rec(int []height, int idx, int n, int cost){
        if(idx == n-1){
            return cost;
        }
        else if(idx >= n){
            return Integer.MAX_VALUE;
        }
        int os = rec(height, idx+1, n, cost + Math.abs(height[idx] - height[idx+1]) );
        int ts = Integer.MAX_VALUE;
        if(idx+ 2 <= n-1){ 
            ts = rec(height, idx+2, n, cost + Math.abs(height[idx] - height[idx+2]));
        }
        
        return Math.min(os, ts);
    }


    int minCost(int[] height) { 
        // code here..... 
        return rec(height, 0, height.length, 0);
        
        
    }
}
