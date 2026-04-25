class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = 0;
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int rep = -1;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }else{
                rep = nums[i];
            }
        }
        int sumTot = n*(n+1)/2;
        int diff = sumTot-sum;
        return new int[]{rep,rep+diff};
    }
}