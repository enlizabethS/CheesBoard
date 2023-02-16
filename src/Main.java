import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] board = new String[8][8];
        fillBoard(board);
        printBoard(board);
    }

    public static void fillBoard(String[][] board) {
        for (int i = 2; i < board.length - 2; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = " ";

            }
        }
        fillWithPawns(board);
        String[] whites = {"\u2656", "\u2658", "\u2657", "\u2654", "\u2655", "\u2657", "\u2658", "\u2656"}; // массив белых фигур
        String[] blacks = {"\u265C", "\u265E", "\u265D", "\u265B", "\u265A", "\u265D", "\u265E", "\u265C"};// массив black фигур
        board[0] = blacks;
        board[7] = whites;
    }

    public static void fillWithPawns(String[][] board) {
        Arrays.fill(board[1], "\u265F");
        Arrays.fill(board[6], "\u2659");
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

