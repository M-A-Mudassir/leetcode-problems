class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        if(n == 0||n==1){
            return 0;
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(ch >= 'A' && ch <='Z'){
                if(!hm.containsKey(ch)){
                    hm.put(ch,i);
                }
            }
        }
        boolean[] sp = new boolean[26];
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <='z'){
                char ch2 = (char)(ch - 32);
                if(hm.containsKey(ch2)){
                    int k = hm.get(ch2);
                    if(i < k){
                        sp[ch-'a'] = true;
                    }else{
                        sp[ch-'a'] = false;
                    }
                }
            }
        }
        int sum = 0;
        for(int i=0;i<26;i++){
            if(sp[i]){
                sum++;
            }
        }
        return sum;
    }
}