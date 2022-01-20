import java.util.HashMap;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                ans.add(nums[i]);
            }else {
                map.put(nums[i],1);
            }
        }
        return ans;
    }
}