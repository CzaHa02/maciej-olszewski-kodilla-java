package com.kodilla.sudoku;



public class NumberValidation {

    private static final int gridSize = 9;
    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < gridSize; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] board, int number, int column) {
        for (int i = 0; i < gridSize; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInSquare(int[][] board, int number, int row, int column) {
        int localSquareRow = row - row % 3;
        int localSquareColumn = column - column % 3;

        for (int i = localSquareRow; i < localSquareRow + 3; i++) {
            for (int f = localSquareColumn; f < localSquareColumn + 3; f++) {
                if (board[i][f] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isValid(int[][] board, int number, int row, int column) {
        return !isNumberInRow(board, number, row) &&
                !isNumberInColumn(board, number, column) &&
                !isNumberInSquare(board, number, row, column);
    }

}
