class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int n = horizontalCuts.length;
        int m = verticalCuts.length;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxh = 0;
        int maxv = 0;
        for(int i=0;i<n-1;i++){
            maxh = Math.max(maxh, horizontalCuts[i+1]-horizontalCuts[i]);
        }
        maxh = Math.max(maxh, h-horizontalCuts[n-1]);
        maxh = Math.max(maxh, horizontalCuts[0]);
        for(int i=0;i<m-1;i++){
            maxv = Math.max(maxv, verticalCuts[i+1]-verticalCuts[i]);
        }
        maxv = Math.max(maxv, w-verticalCuts[m-1]);
        maxv = Math.max(maxv, verticalCuts[0]);
        long f =  (long)maxh*(long)maxv;
        return (int)(f%1000000007);
    }
}