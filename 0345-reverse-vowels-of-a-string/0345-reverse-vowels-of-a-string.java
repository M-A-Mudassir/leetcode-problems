class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char[] arr = s.toCharArray();
        String he = "aeiouAEIOU";
        while(i<=j){
            while(i<j && he.indexOf(s.charAt(i)) == -1){
                i++;
            }
            while(i<j && he.indexOf(s.charAt(j)) == -1){
                j--;
            }
            if(i<j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            j--;
        }
        return new String(arr);
    }
}