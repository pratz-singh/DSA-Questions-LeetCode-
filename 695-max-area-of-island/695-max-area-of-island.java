class Solution {
    public boolean valid(int i, int j, int[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return false;
        }
        return true;
    }
    
    public int help(int[][] grid, boolean[][] path, int i, int j){
        if(!valid(i,j,grid)){
            return 0;
        }
        if(path[i][j] || grid[i][j]==0){
            return 0;
        }
        path[i][j] = true;
        return 1 + help(grid, path, i+1, j) + 
                   help(grid, path, i-1, j) +
                   help(grid, path, i, j+1) +
                   help(grid, path, i, j-1);
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        boolean[][] path = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!path[i][j] && grid[i][j]==1){
                    ans = Math.max(ans, help(grid, path, i, j));
                }
            }
        }
        return ans;
    }
}