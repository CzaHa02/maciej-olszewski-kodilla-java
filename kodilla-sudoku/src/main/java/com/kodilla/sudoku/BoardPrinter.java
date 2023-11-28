package com.kodilla.sudoku;

public class BoardPrinter extends NumberValidation {

    private static final int gridSize = 9;

    public static int[][] board = {


            {9, 1, 0, 5, 8, 2, 0, 0, 0},
            {6, 0, 2, 9, 0, 1, 5, 0, 3},
            {0, 0, 0, 0, 6, 3, 0, 1, 0},
            {0, 0, 0, 3, 0, 0, 2, 4, 0},
            {0, 0, 0, 8, 0, 0, 3, 5, 0},
            {0, 0, 6, 2, 5, 0, 8, 7, 0},
            {7, 0, 0, 0, 0, 8, 0, 0, 0},
            {0, 6, 9, 1, 0, 5, 0, 2, 0},
            {2, 8, 5, 6, 7, 0, 1, 3, 3}
    };


    protected static void printBoard(int[][] board) {
        for (int row = 0; row < gridSize; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("---------------------------");
            }
            for (int column = 0; column < gridSize; column++) {
                if (column % 3 == 0 && column != 0) {
                    System.out.print("    |    ");
                }
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }

    public static boolean solveBoard(int[][] board) {
        for (int row = 0; row < gridSize; row++) {
            for (int column = 0; column < gridSize; column++) {
                if (board[row][column] == 0) {
                    for (int numberToTry = 1; numberToTry <= gridSize; numberToTry++) {
                        if (isValid(board, numberToTry, row, column)) {
                            board[row][column] = numberToTry;

                            if (solveBoard(board)) {
                                return true;
                            }
                            else {
                                board[row][column] = 0;
                            }

                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }



}




