package org.example;


import com.kodilla.sudoku.BoardPrinter;


public class SudokuSolver extends BoardPrinter {
    public static void main(String[] args) {


        System.out.println("Board to solve: ");
         printBoard(board);

        if (BoardPrinter.solveBoard(BoardPrinter.board)) {
            System.out.println("\n"+"Valid board, solved");
            printBoard(board);
        }
       else {
            System.out.println("Unsolvable board, find other grind");
        }



    }


}



























