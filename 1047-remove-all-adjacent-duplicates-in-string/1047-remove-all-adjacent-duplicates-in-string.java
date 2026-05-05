class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            boolean didPop = false;
            while(!st.isEmpty() && st.peek() == ch){
                didPop = true;
                st.pop();                
            }
            if(!didPop){
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}