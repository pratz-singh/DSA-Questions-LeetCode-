import java.util.Stack;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<Integer>();
        int[] leftSmall = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                leftSmall[i] = 0;
            }else {
                leftSmall[i] = st.peek() + 1;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
        int[] rightSmall = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                rightSmall[i] = n-1;
            }else {
                rightSmall[i] = st.peek() - 1;
            }
            st.push(i);
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = Math.max(ans,(rightSmall[i]-leftSmall[i]+1)*heights[i]);
        }
        return ans;
    }
}