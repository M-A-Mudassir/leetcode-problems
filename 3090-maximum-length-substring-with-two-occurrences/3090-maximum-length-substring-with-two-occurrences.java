class Solution {
    public int maximumLengthSubstring(String s) {
        int l = 0;
        HashSet<Character> hs = new HashSet<>();
        for(char ch:s.toCharArray()){
            hs.add(ch);
        }
        int k = hs.size();
        HashMap<Character,Integer> hm = new HashMap<>();
        int res = 0,n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.get(ch) > 2){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res,i-l+1);
        }
        return res;
    }
}