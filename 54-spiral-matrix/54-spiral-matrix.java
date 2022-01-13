class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int k = 0;
        int m = matrix.length;
        int l = 0;
        int n = matrix[0].length;
        int c = 0;
        int t = m*n;
        List<Integer> ans = new ArrayList<>(); 
        while(c<t){
            for(int i=l ;i<n && c<t; i++){
                ans.add(matrix[k][i]);
                c++;
            }
            k++;
            
            for(int i=k; i<m && c<t; i++){
                ans.add(matrix[i][n-1]);
                c++;
            }
            n--;
            
            for(int i=n-1;i>=l && c<t;i--){
                ans.add(matrix[m-1][i]);
                c++;
            }
            m--;
            
            for(int i= m-1; i>=k && c<t; i--){
                ans.add(matrix[i][l]);
                c++;
            }
            l++;
        }
        return ans;
    }
}