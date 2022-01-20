class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int ans = 0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        ans = sum;
        for(int i=0;i<k;i++){
            sum = sum-cardPoints[k-1-i]+cardPoints[n-1-i];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}