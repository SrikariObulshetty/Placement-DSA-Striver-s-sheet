class Solution {

    public int minimumTotal(List<List<Integer>> triangle) { 
         int r = triangle.size();
         List<Integer> dp = new ArrayList<>();
         
        // base cases
        for(int i= 0; i<r;i++){
            dp.add(triangle.get(r-1).get(i) );  
        }

        for(int i=r-2;i>=0;i--){
            List<Integer> list = new ArrayList<>(); 

            for(int j=0;j<=i;j++){

                int down = dp.get(j);
                int diag = dp.get(j+1);

                int temp = Math.min(down, diag) + triangle.get(i).get(j);

                list.add(temp); 

            }
            dp = list;
        }
        return dp.get(0);       
    } 
}
