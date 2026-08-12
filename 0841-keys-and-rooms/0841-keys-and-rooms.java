class Solution {
    public void dfs(List<List<Integer>> rooms,boolean[] visi,int src){
        for(int i:rooms.get(src)){
            if(!visi[i]){
                visi[i] = true;
                dfs(rooms,visi,i);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        dfs(rooms,visited,0);
        for(int i=0;i<n;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }    
}