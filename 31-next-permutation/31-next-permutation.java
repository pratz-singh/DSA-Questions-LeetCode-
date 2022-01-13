class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index1 = -1;
        int index2 = -1;
        for(int i=n-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                index1 = i-1;
                break;
            }
        }
        if(index1==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[index1]){
                index2 = i;
                break;
            }
        }
        int temp = nums[index2];
        nums[index2] = nums[index1];
        nums[index1] = temp;
        int i = index1+1;
        int j = n-1;
        while(i<=j){
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
            i++;
            j--;
        }
        return;
    }
}