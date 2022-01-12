class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=0;i<intervals.length-1;i++){
            if(start<=intervals[i+1][0] && end>=intervals[i+1][0]){
                end = Math.max(end, intervals[i+1][1]);
            }else {
                int[] temp = {start, end};
                ans.add(temp);
                start = intervals[i+1][0];
                end = intervals[i+1][1];
            }
        }
        int last[] = {start, end};
        ans.add(last);
        return ans.toArray(new int[0][]);
    }
}