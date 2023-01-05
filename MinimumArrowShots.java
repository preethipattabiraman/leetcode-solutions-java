class Solution {
    public int findMinArrowShots(int[][] points) {
        int minArrows = 1;
        int row = points.length;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int end = points[0][1];
        for(var i = 1; i < row; i++) {
            if(points[i][0] <= end) {
                continue;
            }
            else {
                end = points[i][1];
                minArrows++;
            }
        }
        return minArrows;
    }
}
