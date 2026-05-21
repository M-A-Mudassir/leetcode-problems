class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> hs  = new HashSet<>();
        for(int i:arr1){
            String st = String.valueOf(i);
            int m = st.length();
            for(int j=1;j<=m;j++){
                hs.add(st.substring(0,j));
            }
        }
        int res = 0;
        for(int i:arr2){
            String s = String.valueOf(i);
            int m = s.length();
            for(int j=1;j<=m;j++){
                if(hs.contains(s.substring(0,j))){
                    res = Math.max(res,j);
                }
            }
        }
        return res;
    }
}