class Solution {
    public void setZeroes(int[][] matrix) {
         int r = matrix.length;
         int c = matrix[0].length;

         boolean row0=false; // to know if row 0 has "0" anywhere or not.
         boolean col0=false; // to know if col 0 has "0" anywhere or not.
         for(int i=0;i<r;i++){
            if(matrix[i][0] == 0){
                col0=true;
            }
         }
         for(int j=0;j<c;j++){
            if(matrix[0][j] == 0){
                row0=true;
            }
         }
         //To set a row or column, any one element should be zero in that row or column.So to track this,we are using first row and column as our trackers and to track in first row and column,we use 2 boolean variables.

         for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0]=0; 
                    matrix[0][j]=0;
                }
            }
         }
         for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
         }
         //check for 1st row and column.
         if(row0){
            for(int i=0;i<c;i++){
                matrix[0][i]=0;
            }
         }
         if(col0){
            for(int j=0;j<r;j++){
                matrix[j][0]=0;
            }
         }
    }
}
