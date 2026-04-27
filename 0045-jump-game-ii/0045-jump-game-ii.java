class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int res = 0;
        while(r < n-1){
            int maxReach = 0;
            for(int i=l;i<=r;i++){
                maxReach = Math.max(i+nums[i],maxReach);
            }
            l = r+1;
            r = maxReach;
            res++;
        }
        return res;
    }
}