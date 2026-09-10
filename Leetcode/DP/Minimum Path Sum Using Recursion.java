class Solution {


    public long min_cost(int [][] grid, int r, int c, int cr, int cc){
        if(cr>=r || cc>=c ){
            return Integer.MAX_VALUE;
        }
        else if(cr==r-1 && cc==c-1){
            return grid[cr][cc];
        }
        long ryt = grid[cr][cc] + min_cost(grid, r, c, cr, cc+1);
        long down = grid[cr][cc] + min_cost(grid, r, c, cr+1, cc);
        return (Math.min(ryt, down)); 

    }

    public int minPathSum(int[][] grid) {
        int r = grid.length; 
        int c = grid[0].length;
        return (int)min_cost(grid, r, c, 0, 0); 
    }
}
