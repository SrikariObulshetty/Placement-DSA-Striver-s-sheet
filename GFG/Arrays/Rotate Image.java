class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        int temp[][] = new int[n][n];
        // Add rotated positions to temp matrix.
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[j][n-i-1] = matrix[i][j];
            }
        }

        //copy back to original matrix.
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=temp[i][j];
            }
        }
    }
}
TC:O(rc)
SC:O(rc)
