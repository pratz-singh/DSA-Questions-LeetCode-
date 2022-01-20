class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void cs(int[] candidates, int i, int target, List<Integer> sol){
        if(target==0){
            //System.out.println(sol);
            ans.add(new ArrayList<>(sol));
            //System.out.println(ans);
            return;
        }
        if(target<0){
            return;
        }
        if(i==candidates.length){
            return;
        }
        cs(candidates, i+1, target, sol);
        sol.add(candidates[i]);
        cs(candidates, i, target-candidates[i], sol);
        sol.remove(sol.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> sol = new ArrayList<>();
        cs(candidates, 0, target, sol);
        return ans;
    }
}