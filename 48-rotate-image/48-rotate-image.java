class Solution {
    public void rotate(int[][] matrix) {
        //1.transpose the matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //2.reverse every row
        for(int i=0;i<matrix.length;i++){
                int l = 0;
                int r = matrix.length-1;
                while(l<=r){
                    int temp = matrix[i][l];
                    matrix[i][l] = matrix[i][r];
                    matrix[i][r] = temp;
                    l++;
                    r--;
                }
        }
        return;
    }
}