// class Solution {
//     public int maxBuilding(int n, int[][] restrictions) {
//         ArrayList<int[]> r = new ArrayList<>();
//         r.add(new int[]{1,0});
//         Arrays.sort(restrictions);
//         int m = restrictions.length;
//         for(int i=1;i<m;i++){
//             int[] temp = new int[2];
//             temp[0] = restrictions[i][0];
//             restrictions[i][1] = Math.min(restrictions[i][1],restrictions[i][0]-r.get(i-1).get(0) + r.get(i-1).get(1));
//             temp[1] = restrictions[i][1];
//             r.add(temp);
//         }
//         for(int i=m-2;i>=0;i--){
//             r.get(i).get(1) = Math.min(r.get(i).get(1),r.get(i+1).get(1)-r.get(i).get(1) + r.get(i+1).get(0));
//         }
//         int ans = 0;
//         for(int i=0;i<m-1;i++){
//             ans = (r.get(i+1).get(0)-r.get(i).get(0)+r.get(i+1).get(1)+r.get(i).get(1))/2;
//         }
//         return ans;
//     }
// }
class Solution {

    public int maxBuilding(int n, int[][] restrictions) {
        // Convert the constraints to a list for manipulation
        List<int[]> r = new ArrayList<>();
        for (int[] res : restrictions) {
            r.add(new int[] { res[0], res[1] });
        }

        // Add restriction (1, 0)
        r.add(new int[] { 1, 0 });
        // Sort by position
        r.sort((a, b) -> Integer.compare(a[0], b[0]));
        // Add restriction (n, n-1)
        if (r.get(r.size() - 1)[0] != n) {
            r.add(new int[] { n, n - 1 });
        }

        int m = r.size();

        // Pass restrictions from left to right
        for (int i = 1; i < m; ++i) {
            int dist = r.get(i)[0] - r.get(i - 1)[0];
            r.get(i)[1] = Math.min(r.get(i)[1], r.get(i - 1)[1] + dist);
        }

        // Pass restrictions from right to left
        for (int i = m - 2; i >= 0; --i) {
            int dist = r.get(i + 1)[0] - r.get(i)[0];
            r.get(i)[1] = Math.min(r.get(i)[1], r.get(i + 1)[1] + dist);
        }

        int ans = 0;
        for (int i = 0; i < m - 1; ++i) {
            // Calculate the maximum height of the buildings between r[i][0] and r[i][1]
            int dist = r.get(i + 1)[0] - r.get(i)[0];
            int best = (dist + r.get(i)[1] + r.get(i + 1)[1]) / 2;
            ans = Math.max(ans, best);
        }

        return ans;
    }
}