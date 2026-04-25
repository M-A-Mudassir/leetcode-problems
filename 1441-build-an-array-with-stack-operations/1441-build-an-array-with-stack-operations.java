class Solution {
    public List<String> buildArray(int[] target, int n) {
        int l = target.length;
        int max = target[l-1];
        List<String> res = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<l;i++){
            hs.add(target[i]);
        }
        for(int i=1;i<=max;i++){
            res.add("Push");
            if(!hs.contains(i)){
                res.add("Pop");
            }
        }
        return res;
    }
}