import java.util.Arrays;

public class BurstBallons {
    public int findMinArrowShots(int[][] points) {
        // Arrays.sort(points, (a,b)->Integer.compare(a[0],b[0]));
        Arrays.sort(points, (a1, a2) -> {
            // We can't simply use the o1[1] - o2[1] trick, as this will cause an
            // integer overflow for very large or small values.
            if (a1[1] == a2[1]) return 0;
            if (a1[1] < a2[1]) return -1;
            return 1;
        });
        int count = 1;
        if(points.length==1) return count;
        int i = 0;
        int j = 1;
        while(j<points.length){
            if(points[j][0]>points[i][1]){
                count++;
                i=j;
            }
            j++;
        }
        return count;
    }
}
