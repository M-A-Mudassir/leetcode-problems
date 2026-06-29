class Solution {
    public int numOfStrings(String[] patterns, String word) {
        HashSet<String> hs = new HashSet<>();
        int n = word.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                hs.add(word.substring(i,j+1));
            }
        }
        int res = 0;
        for(String i:patterns){
            if(hs.contains(i))res++;
        }
        return res;
    }
}