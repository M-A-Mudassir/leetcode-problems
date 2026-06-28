class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int k=0;
        char ch = chars[0];
        int sum =1;
        for(int i=1;i<n;i++){
            if(ch == chars[i]){
                sum++;
            }else{
                chars[k++] = ch;
                if(sum > 1){
                    String num = Integer.toString(sum);
                    for(int j=0;j<num.length();j++){
                        chars[k++] = num.charAt(j);
                    }
                }
                ch = chars[i];
                sum = 1;
            }
        }
        chars[k++] = ch;
        if(sum > 1){
            String num = Integer.toString(sum);
            for(int j=0;j<num.length();j++){
                chars[k++] = num.charAt(j);
            }
        }
        return k;
    }
}