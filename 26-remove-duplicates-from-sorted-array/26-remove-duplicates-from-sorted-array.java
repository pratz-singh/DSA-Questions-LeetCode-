class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int c = 1;
        int a = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]!=a){
                a = nums[i];
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }
}