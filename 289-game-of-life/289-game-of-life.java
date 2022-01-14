class Solution {
    public void gameOfLife(int[][] board) {
        int[][] dir = new int[][]{{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
        int[][] refboard = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int count = 0;
                for(int[] d:dir){
                    int a = i+d[0];
                    int b = j+d[1];
                    if(a>=0 && a<board.length && b>=0 && b<board[0].length && board[a][b]==1){
                        count++;
                    }
                }
                if(board[i][j]==1){
                    if(count==2 || count==3){
                        refboard[i][j]=1;
                    }
                }else {
                    if(count==3){
                        refboard[i][j]=1;
                    }
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = refboard[i][j];
            }
        }
        return;
    }
}