class Solution {


   public long triangles(List<List<Integer>> triangle, int r, int cr, int cc, List<List<Long>>dp){
        // if(cr>=r || cc>= triangle.get(cr).size()){
        //     return Integer.MAX_VALUE;
        // }
        if(cr==r-1){ 
            return triangle.get(cr).get(cc);
        }
        else if(dp.get(cr).get(cc) != Long.MAX_VALUE){
            return dp.get(cr).get(cc); 
        }
        long down = triangle.get(cr).get(cc) + triangles(triangle, r, cr+1, cc, dp);
        long diag = triangle.get(cr).get(cc) + triangles(triangle, r, cr+1, cc+1, dp);

        dp.get(cr).set(cc, Math.min(down, diag));
        return Math.min(down, diag); 
      
   }


    public int minimumTotal(List<List<Integer>> triangle) { 
         int r = triangle.size();
         List<List<Long>> dp = new ArrayList<>();
         for(int i=0;i<r;i++){
            List<Long> list = new ArrayList<>(Collections.nCopies(triangle.get(i).size(),  Long.MAX_VALUE) ); 
            dp.add(list);
         }

         return (int)triangles(triangle, r, 0, 0, dp);        
    }
}
