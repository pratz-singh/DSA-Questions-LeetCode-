class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            int a = nums[i];
            int target = -1*a;
            int s = i+1;
            int e = n-1;
            while(s<e){
                if(nums[s]+nums[e]==target){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(a);
                    temp.add(nums[s]);
                    temp.add(nums[e]);
                    ans.add(temp);
                    while(s<e && nums[s]==nums[s+1]){
                        s++;
                    }
                    while(s<e && nums[e]==nums[e-1]){
                        e--;
                    }
                    s++;
                    e--;
                }else if(nums[s]+nums[e]<target){
                    s++;
                }else {
                    e--;
                }
            }
            while(i+1<n && nums[i]==nums[i+1]){
                i++;
            }
        }
        return ans;
    }
}