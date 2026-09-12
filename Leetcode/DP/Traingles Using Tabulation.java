class Solution {

    public int minimumTotal(List<List<Integer>> triangle) { 
         int r = triangle.size();
         List<List<Integer>> dp = new ArrayList<>();
         for(int i=0;i<r;i++){
            List<Integer> list = new ArrayList<>(Collections.nCopies(i+1,  Integer.MAX_VALUE) ); 
            dp.add(list); 
         }
         
        // base cases
        for(int i= 0; i<r;i++){
            dp.get(r-1).set( i , triangle.get(r-1).get(i) ); 
        }

        for(int i=r-2;i>=0;i--){ 
            for(int j=0;j<=i;j++){

                int down = dp.get(i+1).get(j);
                int diag = dp.get(i+1).get(j+1);

                int temp = Math.min(down, diag) + triangle.get(i).get(j);

                dp.get(i).set(j, temp);

            }
        }
        return dp.get(0).get(0);       
    } 
}
