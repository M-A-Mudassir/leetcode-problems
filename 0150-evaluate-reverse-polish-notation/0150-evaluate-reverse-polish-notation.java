class Solution {
    public int helper(Stack<Integer> st,char ch){
        int a = st.pop();
        int b = st.pop();
        switch(ch){
            case '+':
                return a+b;
            case '-':
                return b-a;
            case '*':
                return a*b;
            case '/':
                return b/a;
            default:
                return 0;
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int l = tokens.length;
        String help = "+-/*";
        for(int i=0;i<l;i++){
            String cur = tokens[i];
            if(cur.length() == 1){
                char ch = cur.charAt(0);
                if(ch=='+' || ch == '-' || ch == '*' || ch == '/'){
                    int k = helper(st,ch);
                    st.push(k);
                }else{
                    st.push(Integer.valueOf(cur));
                }
            }else{
                st.push(Integer.valueOf(cur));
            }
        }
        return st.pop();
    }
}