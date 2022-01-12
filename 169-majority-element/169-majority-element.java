import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        //APPROCH 1-----------------------------
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i], map.get(nums[i])+1);
        //     }else {
        //         map.put(nums[i], 1);
        //     }
        // }
        // int max = Integer.MIN_VALUE; 
        // int ans = -1;
        // for (int x : map.keySet()){
        //     if(max<map.get(x)){
        //         max = map.get(x);
        //         ans = x;
        //     }
        // }
        // return ans;
        //APPROCH 2---------------------------
        // int n = nums.length;
        // Arrays.sort(nums);
        // return nums[(n/2)];
        //APPROCH 3---------------------------
        int n = nums.length;
        int c = nums[0];
        int v = 0;
        for(int i=0;i<n;i++){
            if(c!=nums[i]){
                v--;
            }else {
                v++;
            }
            if(v==0){
                c = nums[i];
                v = 1;
            }
        }
        return c;
    }
}