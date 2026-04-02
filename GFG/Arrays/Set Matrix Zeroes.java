class Solution {
    
    
    public void colZero(int temp[][], int r , int c){
        for(int i=0;i<temp.length;i++){
            temp[i][c] = 0;
        }
    }
    
    
    public void rowZero(int temp[][], int r , int c){
        for(int i=0;i<temp[0].length;i++){
            temp[r][i] = 0;
        }
    }
         
    
    public void setMatrixZeroes(int[][] matrix) {
        // code here
        int r = matrix.length;
        int c = matrix[0].length;
        int temp[][] = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                temp[i][j] = -1;
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    colZero(temp, i, j);
                    rowZero(temp, i, j);
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(temp[i][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }   
    }
}

TC:O(rc(r + c))
SC:O(rc)
