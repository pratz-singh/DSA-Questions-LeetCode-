class Solution {
    public boolean valid(int i, int j, char[][] arr){
        return (i<arr.length && j<arr[0].length && i>=0 && j>=0);
    }
    
    public boolean result(char[][] arr, String w, int i, int j){
        if(w.length()==0){
            return true;
        }
        if(!valid(i,j,arr)){
            return false;
        }
        if(arr[i][j]!=w.charAt(0)){
            return false;
        }
        char temp = arr[i][j];
        arr[i][j] = '*';
        boolean ans = result(arr, w.substring(1), i+1, j) ||
                      result(arr, w.substring(1), i-1, j) ||
                      result(arr, w.substring(1), i, j+1) ||
                      result(arr, w.substring(1), i, j-1) ;
        arr[i][j] = temp;
        return ans;
        
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        //boolean[][] path = new boolean[n][m];
        boolean temp = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //boolean[][] path = new boolean[n][m];
                if(board[i][j]==word.charAt(0)){
                    temp = result(board, word, i, j);
                }
                if(temp){
                    return true;
                }
            }
        }
        return false;
    }
}