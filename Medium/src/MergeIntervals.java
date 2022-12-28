import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        //intervals = [[1,3],[2,6],[8,10],[15,18]]
        int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        MergeIntervals MI = new MergeIntervals();
        int[][] arrResult = MI.merge(arr);
        for(int[] ar: arrResult){
            System.out.println(Arrays.toString(ar));
        }
    }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b)->a[0]-b[0]);
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{intervals[0][0],intervals[0][1]});
        int j=1,i=0;
        while(j<intervals.length){
            if(list.get(i)[1]>=intervals[j][0]){
                list.set(i,new int[]{list.get(i)[0],Math.max(list.get(i)[1],intervals[j][1])});
            }else{
                list.add(new int[]{intervals[j][0],intervals[j][1]});
                i++;
            }
            j++;
        }
        return list.toArray(new int[list.size()][]);
    }
}
