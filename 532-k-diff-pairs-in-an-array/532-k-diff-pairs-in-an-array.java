import java.util.HashMap;
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else {
                map.put(nums[i], 1);
            }
        }
        if(k==0){
            for(int r : map.keySet()){
                if(map.get(r)>1){
                    ans++;
                }
            }
        }else {
            for(int r : map.keySet()){
                if(map.containsKey(k+r)){
                    ans++;
                }
            }
        }
        return ans;
    }
}