class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here...
        int r = mat.length;
        int c= mat[0].length;
        
        boolean row0 = false;
        boolean col0 = false;
        for(int i=0;i<c;i++){
            if(mat[0][i]==0){
                row0=true;
                break;
            }
        }
        
        for(int j=0;j<r;j++){
            if(mat[j][0] == 0){
                col0=true;
                break;
            }
        }
        
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(mat[i][0]==0 || mat[0][j]==0){
                    mat[i][j]=0;
                }
            }
        }
        if(row0){
            for(int i=0;i<c;i++){
                mat[0][i]=0;
            }
        }
        
        if(col0){
            for(int j=0;j<r;j++){
                mat[j][0]=0;
            }
        }
    }
}
TC:O(mn) -> m=rows,n=columns
SC:O(1)
