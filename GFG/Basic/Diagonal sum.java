class Solution {
    public int DiagonalSum(int[][] matrix) {
        // code here.....
        int sum=0;
        int n=matrix.length;
        for(int i=0;i<n;i++){
            sum+=matrix[i][i] + matrix[i][n-i-1];
        }
        return sum;
    }
}
