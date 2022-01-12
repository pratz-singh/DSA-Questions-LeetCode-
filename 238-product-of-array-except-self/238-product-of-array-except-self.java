class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p1 = 1;
        int p2 = 1;
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = 1;
        }
        for(int i=0, j=n-1; i<n && j>=0 ; i++, j--){
            ans[i]*=p1;
            p1*=nums[i];
            ans[j]*=p2;
            p2*=nums[j];
        }
        return ans;
    }
}