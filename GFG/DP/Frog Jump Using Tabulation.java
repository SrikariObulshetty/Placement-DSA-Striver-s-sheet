class Solution {
    int minCost(int[] height) {
        // code here....
        int n = height.length;
        if(n==1){
            return 0;
        }
        int cost[] = new int[n];
        cost[1] = Math.abs(height[1] - height[0]);
        for(int i=2;i<n;i++){ 
            int one = cost[i-1] + Math.abs(height[i] - height[i-1]);
            int sec = cost[i-2] + Math.abs(height[i] - height[i-2]);
            cost[i] = Math.min(one, sec);
        }
        return cost[n-1];  
        
    }
}
