class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int cSum = 0;
        int res = Integer.MAX_VALUE;
        int pDiff = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                cSum = nums[i]+nums[j]+nums[k];
                if(cSum == target){
                    return cSum;
                }else{
                    int diff = Math.abs(cSum-target);
                    if(diff < pDiff){
                        res = cSum;
                        pDiff = diff;
                    }
                    if(cSum > target){
                        k--;
                    }else{
                        j++;
                    }
                }
            }
        }
        return res;
    }
}