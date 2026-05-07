class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] lMax = new int[n];
        lMax[0] = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] > lMax[i-1]){
                lMax[i] = nums[i];
            }else{
                lMax[i] = lMax[i-1];
            }
        }
        int[] rMin = new int[n];
        rMin[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i] < rMin[i+1]){
                rMin[i] = nums[i];
            }else{
                rMin[i] = rMin[i+1];
            }
        }

        int[] res = new int[n];
        res[n-1] = lMax[n-1];
        for(int i=n-2;i>=0;i--){
            if(lMax[i] <= rMin[i+1]){
                res[i] = lMax[i];
            }else{
                res[i] = res[i+1];
            }
        }
        return res;
    }
}