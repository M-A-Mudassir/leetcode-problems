class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[1]-b[1]));
        int n = intervals.length;
        int st = intervals[0][0];
        int end = intervals[0][1];
        int sum =  0;
        for(int i=1;i<n;i++){
            if(end > intervals[i][0]){
                sum++;
            }else{
                st = intervals[i][0];
                end = intervals[i][1];
            }
        }
        return sum;
    }
}