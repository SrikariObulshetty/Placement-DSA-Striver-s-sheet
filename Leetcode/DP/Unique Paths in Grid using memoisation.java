class Solution {


    public int paths(int m, int n, int cr, int cc, int dp[][]){
        if(cr==m-1 && cc==n-1){
            return 1;
        }
        else if(cr<0 || cr>=m || cc<0 || cc>=n){
            return 0;
        }
        if(dp[cr][cc] != -1){
            return dp[cr][cc];
        }
        int ryt = paths(m,n, cr, cc+1, dp);
        int down = paths(m,n, cr+1, cc,dp); 
        dp[cr][cc] = ryt + down;
        return dp[cr][cc];
    }

    public int uniquePaths(int m, int n) {
         int dp[][] = new int[m][n];
         for(int i=0;i<m;i++){
           Arrays.fill(dp[i], -1);
         }
         return paths(m,n,0,0,dp);
        
    }
}
