class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] pre = new int[n];
        HashMap<Integer,Integer> hm = new HashMap<>();
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            pre[i] = nums[i]+pre[i-1];
        }
        hm.put(0,-1);
        for(int i=0;i<n;i++){
            //if(pre[i] % k == 0)return true;
            if(hm.containsKey(pre[i] % k)){
                if((i-hm.get(pre[i] % k) >= 2)){
                    return true;
                }
            }else{
                hm.put(pre[i] % k,i);
            }
            //System.out.println(pre[i] % k);
        }
        return false;
    }
}