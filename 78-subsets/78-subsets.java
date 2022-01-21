class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void help(int[] nums, List<Integer> sol, int i){
        if(i==nums.length){
            ans.add(new ArrayList<Integer>(sol));
            return;
        }
        help(nums, sol, i+1);
        sol.add(nums[i]);
        help(nums, sol, i+1);
        sol.remove(sol.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> sol = new ArrayList<>();
        help(nums, sol, 0);
        return ans;
    }
}