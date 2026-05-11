package Kunal.BackTracking;


//https://leetcode.com/problems/sudoku-solver/?envType=problem-list-v2&envId=backtracking
public class LeetSudukoSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
    }

    public static boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;


        boolean emptyFound = false;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyFound = true;
                    break;
                }
            }

            if(emptyFound) {
                break;
            }
        }

        if(emptyFound == false) {
            return true;
        }

        char number ='1';
        while(number <= '9') {

            if(isSafe(board, row, col, number)) {
                board[row][col] = number;
                if(solve(board)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
            number++;
        }

        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col, char currentValue) {
        for(int i = 0; i < board.length; i++) {
            if(board[row][i] == currentValue) {
                return false;
            }
        }

        for(char[] rowS : board) {
            if(rowS[col] == currentValue) {
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));

        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int r = rowStart; r <= rowStart + sqrt; r++) {
            for(int c = colStart; c <= colStart + sqrt; c++) {
                if(board[r][c] == currentValue) {
                    return false;
                }
            }
        }

        return true;
    }
}
