class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int ans = 0;
        int l = 0;
        int r = n-1;
        while(l<r){
            int lh = height[l];
            int rh = height[r];
            int temp = Math.min(lh,rh)*(r-l);
            ans = Math.max(ans, temp);
            if(lh<rh){
                l++;
            }else {
                r--;
            }
        }
        return ans;
    }
}