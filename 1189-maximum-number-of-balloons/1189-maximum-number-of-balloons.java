class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        int[] arr = new int[26];
        for(int i=0;i<n;i++){
            arr[text.charAt(i)-'a']++;
        }
        String help = "balloon";
        int res = Integer.MAX_VALUE;
        for(int i=0;i<7;i++){
            if(help.charAt(i) =='l' || help.charAt(i) == 'o'){
                res = Math.min(res,arr[help.charAt(i)-'a']/2);
            }else{
                res = Math.min(res,arr[help.charAt(i)-'a']);
            }
        }
        return res;
    }
}