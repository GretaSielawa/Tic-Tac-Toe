package tictactoepackage;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Grid {


    Scanner scanner = new Scanner(System.in);
    boolean validInput = false;

    //public char[][] board = new char[3][3];
    char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    int[] userCoordinates = new int[2];
    int[] secondCoordinates = new int[2];
    int userCoordinate0;
    int userCoordinate1;
    int secondCoordinates0;
    int getSecondCoordinates1;


//    public void createTicTacToeBoard() {
//        char[] validSymbols = {'X', 'O', '_'};
//        boolean isValidInput = false;
//        while (!isValidInput) {
//            String inputLine = scanner.nextLine();
//            if (inputLine.length() != 9) {
//                System.out.println("Invalid input!");
//            } else {
//                isValidInput = true;
//                for (int i = 0; i < 9; i++) {
//                    char symbol = inputLine.charAt(i);
//                    if (!isValidSymbol(symbol, validSymbols)) {
//                        System.out.println("Invalid symbol!");
//                        break;
//                    }
//                    board[i / 3][i % 3] = symbol;
//                }
//
//            }
//
//        }
//
//
//    }
//
//
//    public boolean isValidSymbol(char symbol, char[] validSymbols) {
//        for (char validSymbol : validSymbols) {
//            if (symbol == validSymbol) {
//                return true;
//            }
//        }
//        return false;
//    }

    public void printBoard() {
        System.out.println("---------");
        for (int row = 0; row < board.length; row++) {
            System.out.print("| "); // Print first line
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col] + " ");

            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }


    public void createTicTacToeBoardOfCoordinates(char[][] board) {
        while (true) {
            try {
                for (int i = 0; i < userCoordinates.length; i++) {
                    userCoordinates[i] = scanner.nextInt();
                }

                int row = userCoordinates[0] - 1;
                int col = userCoordinates[1] - 1;

                if (userCoordinates[0] < 1 || userCoordinates[0] > 3 || userCoordinates[1] < 1 || userCoordinates[1] > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue; // Continue to the next iteration of the loop.
                }

                if (board[row][col] == 'X' || board[row][col] == 'O' && board[row][col] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue; // Continue to the next iteration of the loop.
                }

                board[row][col] = 'X';
                break;
            } catch (NoSuchElementException e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
        }
    }


    public void createTicTacToeBoardOfSecondUserCoordinates(char[][] board) {
        while (true) {
            try {
                for (int i = 0; i < secondCoordinates.length; i++) {
                    secondCoordinates[i] = scanner.nextInt();
                }

                int row = secondCoordinates[0] - 1;
                int col = secondCoordinates[1] - 1;

                if (secondCoordinates[0] < 1 || secondCoordinates[0] > 3 || secondCoordinates[1] < 1 || secondCoordinates[1] > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue; // Continue to the next iteration of the loop.
                }

                if (board[row][col] == 'X' || board[row][col] == 'O' && board[row][col] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue; // Continue to the next iteration of the loop.
                }

                board[row][col] = 'O';
                break;
            } catch (NoSuchElementException e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();

            }
        }
    }




}//class

