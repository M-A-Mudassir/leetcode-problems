class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int n = intervals.length;
        int st = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<n;i++){
            if(end < intervals[i][0]){
                res.add(new int[]{st,end});
                st = intervals[i][0];
                end = intervals[i][1];
            }else{
                end = Math.max(end , intervals[i][1]);
                //st = Math.min(st,intervals[i][0]);
            }
        }
        res.add(new int[]{st,end});
        return res.toArray(new int[res.size()][]);
    }
}