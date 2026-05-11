package Kunal.BackTracking;

public class SudukoSolver {
    public static void main() {


        int[][] board = {

        };
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean foundEmpty = false;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 0) {
                    foundEmpty = true;
                    row = i;
                    col = j;
                    break;
                }
            }
            if(foundEmpty) {
                break;
            }
        }
        if(!foundEmpty) {
            return true;
        }

        for(int number = 1; number <= 9; number++ ) {
            if(isSafe(board, row, col, number)) {
                board[row][col] = number;

                if(solve(board)) {

                    display(board);
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    static void display(int[][] board) {
        for(int[] nums : board) {
            for(int i : nums) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }


    static boolean isSafe(int[][] board, int row, int col, int num) {

        //check the row
        for(int i = 0; i < board.length; i++) {
            if(board[i][col] == num) {
                return false;
            }
        }

        for(int[] nums : board) {
            if(nums[col] == num){
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int r = rowStart; r < rowStart + sqrt; r++) {
            for(int c = colStart; c < colStart + sqrt; c++) {
                if(board[row][col] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
