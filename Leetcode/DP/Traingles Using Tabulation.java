class Solution {

    public int minimumTotal(List<List<Integer>> triangle) { 
         int r = triangle.size();
         List<List<Long>> dp = new ArrayList<>();
         for(int i=0;i<r;i++){
            List<Long> list = new ArrayList<>(Collections.nCopies(i+1,  Long.MAX_VALUE) ); 
            dp.add(list); 
         }
         
        // base cases
        for(int i= 0; i<r;i++){
            dp.get(r-1).set( i , (long)triangle.get(r-1).get(i) ); 
        }

        for(int i=r-2;i>=0;i--){ 
            for(int j=0;j<=i;j++){

                long down = dp.get(i+1).get(j);
                long diag = dp.get(i+1).get(j+1);

                long temp = Math.min(down, diag) + (long)triangle.get(i).get(j);

                dp.get(i).set(j, temp);

            }
        }
        return (int)(dp.get(0).get(0).longValue());       
    } 
}
