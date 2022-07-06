package tiktactoegame;

public class App {
    /*
         this  a graphic example
         we have rows and columns
               C0, c1, c2, c3, c4
        row0   0   |   2   |   4
        row1   0   |   2   |   4
        row2   0   |   2   |   4

         */
        static  char [][] gameBoard = {
                  { '_' ,  '|', '_', '|', '_' },
                  { '_' ,  '|', '_', '|', '_' },
                  { ' ' ,  '|', '_', '|',' ' }
        };


        static   boolean gameOver = false;
    static boolean playAgain = true;

    public static void main(String[] args) {

        //this line will be executed to initialize the gameBoard
        CreateGameBoard.printGameBoard(gameBoard);
        System.out.println("");
        System.out.println(" Tic Tac Toe Game!! ");

        while (playAgain) {
            while (!gameOver) {
                //if the gameBoard is not full in all the positions available, we need to ask the user to choose a new position
                //where to move the gameBoard.
                PlayerMove.playerIsMoving(gameBoard);
                //we check if the gameBoard is already full in all the positions available.
                gameOver = GameOver.isThisGameOver(gameBoard);
                if (gameOver) {
                    break;
                }

                //if the gameBoard is not full in all the positions available, the computer will generate a new position randomly
                PlayerMove.computerIsMoving(gameBoard);
                gameOver = GameOver.isThisGameOver(gameBoard);
                if (gameOver) {
                    break;
                }
            }
        }

    }
}
