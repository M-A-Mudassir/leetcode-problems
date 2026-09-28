class Solution {
    public int maxDepth(String s) {
        int res = 0,sum=0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                sum++;
                res = Math.max(res,sum);
            }else if(ch == ')'){
                sum--;
            }
        }
        return res;
    }
}