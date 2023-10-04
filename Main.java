package tictactoepackage;

public class Main {
    public static void main(String[] args) {


        Grid grid = new Grid();
        GameStateAnalyzer gameStateAnalyzer = new GameStateAnalyzer();
        grid.printBoard();

        boolean gameEnded = false;
        while (!gameEnded) {
            grid.createTicTacToeBoardOfCoordinates(grid.board);
            grid.printBoard();

            if (gameStateAnalyzer.xWins(grid.board)) {
                System.out.println("X wins");
                break;
            } else if (gameStateAnalyzer.oWins(grid.board)) {
                System.out.println("O wins");
                break;
            } else if (gameStateAnalyzer.isDraw(grid.board)) {
                System.out.println("Draw");
                break;
            }
            grid.createTicTacToeBoardOfSecondUserCoordinates(grid.board);
            grid.printBoard();

            if (gameStateAnalyzer.xWins(grid.board)) {
                System.out.println("X wins");
                break;
            } else if (gameStateAnalyzer.oWins(grid.board)) {
                System.out.println("O wins");
                break;
            } else if (gameStateAnalyzer.isDraw(grid.board)) {
                System.out.println("Draw");
                break;
            }
        }



    }
}