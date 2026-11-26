class Solution {
    public boolean canAliceWin(int n) {
        boolean res = true;
        int pick = 10;
        while(n >= pick){
            n -= pick;
            pick--;
            res = !res;
        }
        return !res;
    }
}