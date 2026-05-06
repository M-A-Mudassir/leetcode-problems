class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n = boxGrid.length;
        int m = boxGrid[0].length;
        char[][] mat = new char[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[j][i]= boxGrid[i][j];
            }
        }
        for(int i=0;i<m;i++){
            int lo = 0;
            int hi = n-1;
            while(lo<hi){
                char temp = mat[i][lo];
                mat[i][lo] = mat[i][hi];
                mat[i][hi] = temp;
                lo++;
                hi--;
            }
        }
        for(int j=0;j<n;j++){
            int i=m-1;
            int sp = m-1;
            while(i>=0){
                if(mat[i][j] == '*'){
                    sp = i-1;
                }else if(mat[i][j] == '#'){
                    char temp = mat[sp][j];
                    mat[sp][j] = mat[i][j];
                    mat[i][j] = temp;
                    sp--;
                }
                i--;
            }
        }
        return mat;
    }
}