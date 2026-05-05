class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }else if(ch == ')'){
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    res[i] = '*';
                }
            }
        }
        if(!st.isEmpty()){
            while(!st.isEmpty()){
                res[st.pop()] = '*';
            }
        }
        for(int i=0;i<n;i++){
            if(res[i] !='*'){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}