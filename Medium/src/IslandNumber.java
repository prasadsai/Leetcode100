import java.util.Deque;
import java.util.LinkedList;

public class IslandNumber {
    public int numIslands(char[][] grid) {
        boolean[][] gridBoolean = new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!gridBoolean[i][j] && grid[i][j]=='1'){
                    numIslandsCheck(grid,gridBoolean,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public void numIslandsCheck(char[][] grid, boolean[][] gridBoolean,int row, int col){
        Deque<int[]> stack = new LinkedList<>();
        stack.push(new int[]{row, col});
        while(!stack.isEmpty()){
            int[] current = stack.pop();
            gridBoolean[current[0]][current[1]] = true;
            if(current[0]>0 && grid[current[0]-1][current[1]] == '1' && !gridBoolean[current[0]-1][current[1]]){
                gridBoolean[current[0]-1][current[1]] = true;
                stack.push(new int[]{current[0]-1,current[1]});
            }
            if(current[1]>0 && grid[current[0]][current[1]-1] == '1' && !gridBoolean[current[0]][current[1]-1]){
                gridBoolean[current[0]][current[1]-1] = true;
                stack.push(new int[]{current[0],current[1]-1});
            }
            if(current[0]<grid.length-1 && grid[current[0]+1][current[1]] == '1' && !gridBoolean[current[0]+1][current[1]]){
                gridBoolean[current[0]+1][current[1]] = true;
                stack.push(new int[]{current[0]+1,current[1]});
            }
            if(current[1]<grid[0].length-1 && grid[current[0]][current[1]+1] == '1' && !gridBoolean[current[0]][current[1]+1]){
                gridBoolean[current[0]][current[1]+1] = true;
                stack.push(new int[]{current[0],current[1]+1});
            }
        }
    }
}