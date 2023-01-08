import java.util.Optional;
import java.util.Map.Entry;

class Solution {
    public int maxPoints(int[][] points) {
        int result = 1;
        int maxPoints = 1;
        if(points.length == 1) {
            return result;
        }
        for(var i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            Map<Double, Integer> slopes = new HashMap<Double, Integer>();
            for(var j = 0; j < points.length ; j++) {
                if(i == j)
                    continue;
                int x2 = points[j][0];
                int y2 = points[j][1];
                double slope = Integer.MAX_VALUE;
                if(x1 != x2) {
                    slope = (y2-y1)*1.0/(x2-x1);
                }
                slopes.put(slope, slopes.getOrDefault(slope, 1) + 1);
                maxPoints = Math.max(maxPoints, slopes.get(slope));
            }
        }

       
        return maxPoints;
    }
}
