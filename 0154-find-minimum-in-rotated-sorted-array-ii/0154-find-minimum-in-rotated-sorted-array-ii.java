class Solution {
    public int findMin(int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int i:nums){
            if(res > i){
                res = i;
            }
        }
        return res;
    }
}