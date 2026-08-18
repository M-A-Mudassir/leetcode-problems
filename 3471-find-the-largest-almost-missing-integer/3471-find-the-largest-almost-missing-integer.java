class Solution {
    public int largestInteger(int[] nums, int k) {
        if(k == nums.length){
            int res = -1;
            for(int i:nums){
                res = Math.max(i,res);
            }
            return res;
        }
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int res = -1;
        if(k == 1){
            for(int i:hm.keySet()){
                if(hm.get(i) == 1){
                    res = Math.max(res,i);
                }
            }
            return res;
        }
        if(hm.get(nums[0]) == 1 && hm.get(nums[n-1]) == 1){
            return Math.max(nums[0],nums[n-1]);
        }else if(hm.get(nums[0]) > 1 && hm.get(nums[n-1])== 1){
            return nums[n-1];
        }else if(hm.get(nums[0]) == 1 && hm.get(nums[n-1])> 1){
            return nums[0];
        }
        return -1;
    }
}