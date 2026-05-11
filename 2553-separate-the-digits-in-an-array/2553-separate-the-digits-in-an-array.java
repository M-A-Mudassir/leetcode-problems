class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int i:nums){
            String st = String.valueOf(i);
            for(int j=0;j<st.length();j++){
                li.add(st.charAt(j)-'0');
            }
        }
        int n = li.size();
        int[]res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = li.get(i);
        }
        return res;
    }
}