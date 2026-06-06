class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> li = new ArrayList<>();
            li.add(1);
            for(int j=1;j<=i-1;j++){
                li.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            if(i != 0){
                li.add(1);
            }   
            res.add(li);
        }
        return res;
    }
}