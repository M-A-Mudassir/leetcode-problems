class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int l =0;
        int res = -1;
        int sum = 0;
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
            sum++;
            while(hm.size() > 2){
                sum--;
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                l++;
            }
            res = Math.max(res,sum);
        }
        return res;
    }
}