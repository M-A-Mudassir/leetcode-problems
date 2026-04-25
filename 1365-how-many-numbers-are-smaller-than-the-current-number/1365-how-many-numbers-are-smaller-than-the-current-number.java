class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] copy = new int[n];
        for(int i=0;i<n;i++){
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(copy[i])){
                hm.put(copy[i],i);
            }
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = hm.get(nums[i]);
        }
        return res;
    }
}