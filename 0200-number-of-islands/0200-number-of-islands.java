class Solution {
    public void calHelper(int i,int j,char[][] grid,int n,int m){
        if(i >= n || i<0 || j>=m || j < 0)return;
        if(grid[i][j] =='1'){
            grid[i][j] = '0';
            calHelper(i-1,j,grid,n,m);
            calHelper(i,j+1,grid,n,m);
            calHelper(i+1,j,grid,n,m);
            calHelper(i,j-1,grid,n,m);
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    calHelper(i,j,grid,n,m);
                    sum++;
                }
            }
        }
        return sum;
    }
}