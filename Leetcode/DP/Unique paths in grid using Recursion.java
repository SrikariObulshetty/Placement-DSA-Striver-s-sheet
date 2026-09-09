class Solution {


    public int paths(int m, int n, int cr, int cc){
        if(cr==m-1 && cc==n-1){
            return 1;
        }
        else if(cr<0 || cr>=m || cc<0 || cc>=n){
            return 0;
        }
        int ryt = paths(m,n, cr, cc+1);
        int down = paths(m,n, cr+1, cc);
        return ryt + down;
    }

    public int uniquePaths(int m, int n) {
         return paths(m,n,0,0);
        
    }
}
