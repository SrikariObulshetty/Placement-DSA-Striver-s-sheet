class Solution {
    public void rotate(int[][] matrix) {
        //Optimal solution without using space is just observe,the rotated matrix
        // is ntng but the transpose + reversing evry row elemets.
        int n = matrix.length;

        //TRANSPOSE
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        } 

        //Rotate elements in evry row.
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
}

TC:O(rc)
SC:O(1)
