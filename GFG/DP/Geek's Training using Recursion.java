class Solution {
    
    
    public int dp(int mat[][], int day, int days, int prev){
        if(day >= days){
            return 0;
        }
        
        int sum =  Integer.MIN_VALUE;
        for(int i = 0; i<3; i++){
            if(i!=prev){
                sum = Math.max(sum, mat[day][i] + dp(mat, day+1, days, i)); 
            }
        }
        return sum; 
    } 
    
    
    
    public int maximumPoints(int mat[][]) {
        // code here.....
        
        return dp(mat, 0, mat.length, -1);
        
    }
}
