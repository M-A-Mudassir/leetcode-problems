class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!hs.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}