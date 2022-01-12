class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 1;
        int i = 0;
        while(i<n){
            if(ans>nums[i]){
                i++;
            }else if(ans==nums[i]){
                ans++;
                i++;
            }else {
                return ans;
            }
        }
        return ans;
    }
}