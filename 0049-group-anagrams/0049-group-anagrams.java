class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String st :strs){
            int[] arr = new int[26];
            int n = st.length();
            for(int i=0;i<n;i++){
                arr[st.charAt(i)-'a']++;
            }
            String idx = Arrays.toString(arr);
            if(hm.containsKey(idx)){
                List<String> li = hm.get(idx);
                li.add(st);
                hm.put(idx,li);
            }else{
                List<String> li = new ArrayList<>();
                li.add(st);
                hm.put(idx,li);
            }
        } 
        List<List<String>> res = new ArrayList<>();
        for(List<String> l:hm.values()){
            res.add(l);
        }
        return res;
    }
}