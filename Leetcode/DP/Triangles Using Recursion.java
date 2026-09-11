class Solution {


   public long triangles(List<List<Integer>> triangle, int r, int cr, int cc){
        if(cr>=r || cc>= triangle.get(cr).size()){
            return Integer.MAX_VALUE;
        }
        else if(cr==r-1){
            return triangle.get(cr).get(cc);
        }

        long down = triangle.get(cr).get(cc) + triangles(triangle, r, cr+1, cc);
        long diag = triangle.get(cr).get(cc) + triangles(triangle, r, cr+1, cc+1);

        return Math.min(down, diag); 
      
   }


    public int minimumTotal(List<List<Integer>> triangle) {
         int r = triangle.size();
         return (int)triangles(triangle, r, 0, 0);        
    }
}
