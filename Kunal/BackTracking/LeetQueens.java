package Kunal.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class LeetQueens {

    public  static List<List<String>> end = new ArrayList<>();

    public static void main() {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nQueen(board, 0);

        for(List<String> list : end) {
            for(String str : list) {
                System.out.println(str);
            }
            System.out.println();
        }
    }

    public static List<List<String>> nQueen(boolean[][] board, int row) {

        if(row == board.length) {
            end.add(display(board));
            System.out.println();
            return end;
        }

        for(int col = 0; col < board.length; col++) {

            if(safeBoard(board, row, col)) {
                board[row][col] = true;
                nQueen(board, row + 1);
                board[row][col] = false;
            }
        }
        return end;
    }

    public static boolean safeBoard(boolean[][] board, int row, int col) {
        for(int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for(int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        int maxRight = Math.min(row, board.length - col - 1);

        for(int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i]) return false;
        }


        return true;
    }


    public static List<String> display(boolean[][] board) {

        List<String> result = new ArrayList<>();
        for(boolean[] row : board) {
            String str = "";
            for(boolean element : row) {
                if(element) {
                    str +="Q";
                } else {
                    str+=".";
                }
            }
            result.add(str);
        }
        return result;
    }
}
