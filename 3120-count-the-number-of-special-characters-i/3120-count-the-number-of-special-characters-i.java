class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <='z'){
                arr1[ch-'a']++;
            }else{
                arr2[ch-'A']++;
            }
        }
        int sum = 0;
        for(int i=0;i<26;i++){
            if(arr1[i] >=1 && arr2[i] >= 1){
                sum++;
            }
        }
        return sum;
    }
}