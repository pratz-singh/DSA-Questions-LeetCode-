class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int diff = 0;
        for(int i=0;i<nums.length-1;i++){
            int a = i;
            int b = i+1;
            int c = nums.length-1;
            while(b<c){
                int temp = nums[a] + nums[b] + nums[c];
                if(Math.abs(temp-target)<ans){
                    diff = temp;
                    ans = Math.abs(temp-target);
                }
                if(temp>target){
                    c--;
                }else {
                    b++;
                }
            }
        }
        return diff;
    }
}