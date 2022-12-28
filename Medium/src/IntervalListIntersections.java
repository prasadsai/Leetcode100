import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalListIntersections {

    public static void main(String[] args) {
//        firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
        int[][] firstList = { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } };
        int[][] secondList = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };
        IntervalListIntersections ILI = new IntervalListIntersections();
        int[][] arrResult = ILI.intervalIntersection(firstList,secondList);
        for(int[] ar: arrResult){
            System.out.println(Arrays.toString(ar));
        }
    }
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i=0,j=0;
        List<int[]> list = new ArrayList<>();
        while(i<firstList.length && j<secondList.length){
            int max=Math.max(firstList[i][0],secondList[j][0]);
            int min=Math.min(firstList[i][1],secondList[j][1]);
            if(max<=min){
                list.add(new int[]{max,min});
            }
            if(firstList[i][1]<secondList[j][1]){
                i++;
            }else if(firstList[i][1]>secondList[j][1]){
                j++;
            }else{
                i++;j++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
