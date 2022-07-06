package tiktactoegame;

public class UpdateBoard {

     //this method is called when the user or the computer is connected and ready to play.
    public static void changeBoard(int position, int player, char[][] gameBoard) {

        /*
         this  a graphic example
         we have rows and columns
               C0, c1, c2, c3, c4
        row0   0   |   2   |   4
        row1   0   |   2   |   4
        row2   0   |   2   |   4

         */

        char character;
        if(player == 1) {
            character = 'X';
        }else{
            character = 'O';
        }
       switch (position){

            case 1:
                gameBoard[0][0] = character;
                 CreateGameBoard.printGameBoard(gameBoard);
                break;
            case 2:
                gameBoard[0][2] = character;
                CreateGameBoard.printGameBoard(gameBoard);
                break;
            case 3:
                gameBoard[0][4] = character;
                CreateGameBoard.printGameBoard(gameBoard);
                break;
            case 4:
                gameBoard[1][0] = character;
                 CreateGameBoard.printGameBoard(gameBoard);
                break;
            case 5:
                gameBoard[1][2] = character;
                 CreateGameBoard.printGameBoard(gameBoard);
                break;
            case 6:
                gameBoard[1][4] = character;
                 CreateGameBoard.printGameBoard(gameBoard);
                break;
            case 7:
                gameBoard[2][0] = character;
                 CreateGameBoard.printGameBoard(gameBoard);
                break;
            case 8:
                gameBoard[2][2] = character;
                 CreateGameBoard.printGameBoard(gameBoard);
                break;
            case 9:
                gameBoard[2][4] = character;
                 CreateGameBoard.printGameBoard(gameBoard);
                break;
            default:
                break;

        }
    }

}
