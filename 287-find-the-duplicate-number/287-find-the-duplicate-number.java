import java.util.HashMap;
class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         return nums[i];
        //     }else {
        //         map.put(nums[i],1);
        //     }
        // }
        // return 0;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}