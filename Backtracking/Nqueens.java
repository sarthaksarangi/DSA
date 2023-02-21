package Backtracking;

public class Nqueens {
    public static void main (String [] args){
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]= 'x';
            }
        }
        nQueens(board, 0);
    }
    public static void nQueens(char[][] board, int row){
        // First place the queens int every row without checking for any conditions
        // How to place
        // Base case
        if (row == board.length){
            printBoard(board);
            return;
        }
        //column loop
        for(int j = 0; j<board.length;j++){
            if (isSafe(board,row,j)){
                //First place the Queen in one row
                board[row][j]='Q';
                //Call for the next Row
                nQueens(board,row+1);
                //Remove the previously places queen in the backtracking step to place the queen in a different position
                board[row][j]='x';
            }

        }
    }
    public static boolean isSafe(char[][] board, int row, int col){
        //Checking vertically
        for (int i = row-1; i >=0 ; i--) {
            if (board[i][col]=='Q'){
                return false;
            }
        }
        //Checking for the left diagonal
        for (int i = row-1, j = col-1; i>=0 &&j>=0 ; i--,j--) {
            if (board[i][j]=='Q'){
                return false;
            }

        }
        //Checking for right upper diagonal
        for (int i = row-1,j = col+1; i >=0 && j<board.length ; i-- , j++) {
            if (board[i][j]=='Q'){
                return false;
            }

        }
        return true;
    }

    private static void printBoard(char[][] board) {
        System.out.println("------- Chess Board -------");
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0 ; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
            
        }
    }
}
