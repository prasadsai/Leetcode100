import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticOcean {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> list = new ArrayList<>();
        int rowLen = heights.length;
        int colLen = heights[0].length;
        boolean[][] pacific = new boolean[rowLen][colLen];
        boolean[][] atlantic = new boolean[rowLen][colLen];

        for(int i=0;i<colLen;i++){
            pacificAtlanticHelper(heights,0,i,Integer.MIN_VALUE,pacific);
            pacificAtlanticHelper(heights,rowLen-1,i,Integer.MIN_VALUE,atlantic);
        }

        for(int i=0;i<rowLen;i++){
            pacificAtlanticHelper(heights,i,0,Integer.MIN_VALUE,pacific);
            pacificAtlanticHelper(heights,i,colLen-1,Integer.MIN_VALUE,atlantic);
        }
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    list.add(Arrays.asList(i,j));
                }
            }
        }
        return list;
    }

    public void pacificAtlanticHelper(int[][] heights, int row, int col, int prev, boolean[][] ocean){
        if(row<0 || col<0 || row>=heights.length || col>=heights[0].length) return;
        if(heights[row][col]<prev || ocean[row][col]) return;
        ocean[row][col]=true;
        pacificAtlanticHelper(heights,row-1,col,heights[row][col],ocean);
        pacificAtlanticHelper(heights,row,col-1,heights[row][col],ocean);
        pacificAtlanticHelper(heights,row,col+1,heights[row][col],ocean);
        pacificAtlanticHelper(heights,row+1,col,heights[row][col],ocean);
    }
}
