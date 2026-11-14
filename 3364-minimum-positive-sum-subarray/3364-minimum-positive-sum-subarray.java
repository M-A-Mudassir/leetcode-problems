class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;
        int n = nums.size();
        for(int i=0;i<n;i++){
            int sum = 0;
            int len = 0;
            for(int j=i;j<n;j++){
                len++;
                sum += nums.get(j);
                if(len >= l && len <= r && sum > 0){
                    res = Math.min(res,sum);
                }
                if(len >= r){
                    break;
                }
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}