package tictactoepackage;

public class GameStateAnalyzer {

    public boolean gameNotFinished(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == ' ' || board[row][col] == '_' && xWins(board) || oWins(board) || isDraw(board) || impossible(board)) {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean isDraw(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (!xWins(board)) {
                    oWins(board);
                }
                return false;
            }
        }
        return true;
    }





    public boolean xWins(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X' ||
                    board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ||
                    board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
                return true;
            }
        }
        return false;
    }

    public boolean oWins(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O' ||
                    board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O') {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ||
                    board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                return true;
            }
        }

        return false;
    }


    public boolean impossible(char[][] board) {

        if (xWins(board) && oWins(board)) {
            return true;
        }

        int xCount = 0;
        int oCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X') {
                    xCount++;
                } else if (board[i][j] == 'O') {
                    oCount++;
                }
            }
        }
        return Math.abs(xCount - oCount) >= 2;
    }





}
