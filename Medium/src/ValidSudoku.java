public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                    if(!isValidHelper(board, i, j, board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidHelper(char[][] board, int row, int col, char num){
        //check row
        for(int i=0;i<board.length;i++){
            if(i==col){
                continue;
            }
            if(board[row][i]==num){
                return false;
            }
        }
        //check column
        for(int i=0;i<board.length;i++){
            if(i==row){
                continue;
            }
            if(board[i][col]==num){
                return false;
            }
        }
        //check the sub-box
        int startRow = row - (row%3);
        int startCol = col - (col%3);
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(i==row && j==col){
                    continue;
                }
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
}