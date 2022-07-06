package tiktactoegame;

public class GameOver {
     static  int playerScore = 0;
    static int computerScore = 0;

    //we check if the game is over and if it is over we check who won the game!!
    public static boolean isThisGameOver(char [][] gameBoard){

    //Horizontal Winner
    if(gameBoard[0][0] == 'X'&& gameBoard[0][2] == 'X' && gameBoard [0][4] == 'X' ){
        System.out.println("Congrats, the Player Won");
        playerScore++;
        return true;
    }
    if(gameBoard[0][0] == 'O'&& gameBoard[0][2] == 'O' && gameBoard [0][4] == 'O' ){
       System.out.println("Congrats, the Computer Won");
        computerScore++;
        return true;
    }
    if(gameBoard[1][0] == 'X'&& gameBoard[1][2] == 'X' && gameBoard [1][4] == 'X' ){
        System.out.println("Congrats, the Player Won");
        playerScore++;
        return true;
    }
    if(gameBoard[1][0] == 'O'&& gameBoard[1][2] == 'O' && gameBoard [1][4] == 'O' ){
      System.out.println("Congrats, the Computer Won");
        computerScore++;
        return true;
    }
    if(gameBoard[2][0] == 'X'&& gameBoard[2][2] == 'X' && gameBoard [2][4] == 'X' ){
        System.out.println("Congrats, the Player Won");
        playerScore++;
        return true;
    }
    if(gameBoard[2][0] == 'O'&& gameBoard[2][2] == 'O' && gameBoard [2][4] == 'O' ) {
       System.out.println("Congrats, the Computer Won");
        computerScore++;
        return true;
    }

    //Vertical Winner

        if(gameBoard[0][0] == 'X'&& gameBoard[1][0] == 'X' && gameBoard [2][0] == 'X' ){
           System.out.println("Congrats, the Player Won");
            playerScore++;
            return true;
        }
        if(gameBoard[0][0] == 'O'&& gameBoard[1][0] == 'O' && gameBoard [2][0] == 'O' ){
          System.out.println("Congrats, the Computer Won");
            computerScore++;
            return true;
        }

        if(gameBoard[0][2] == 'X'&& gameBoard[1][2] == 'X' && gameBoard [2][2] == 'X' ){
           System.out.println("Congrats, the Player Won");
            playerScore++;
            return true;
        }
        if(gameBoard[0][2] == 'O'&& gameBoard[1][2] == 'O' && gameBoard [2][2] == 'O' ){
            System.out.println("Congrats, the Computer Won");
            computerScore++;
            return true;
        }

        if(gameBoard[0][4] == 'X'&& gameBoard[1][4] == 'X' && gameBoard [2][4] == 'X' ){
            System.out.println("Congrats, the Player Won");
            playerScore++;
            return true;
        }
        if(gameBoard[0][4] == 'O'&& gameBoard[1][4] == 'O' && gameBoard [2][4] == 'O' ){
           System.out.println("Congrats, the Computer Won");
            computerScore++;
            return true;
        }

        //Diagonal Winner
        if(gameBoard[0][0] == 'X'&& gameBoard[1][2] == 'X' && gameBoard [2][4] == 'X' ){
            System.out.println("Congrats, the Player Won");
            playerScore++;
            return true;
        }
        if(gameBoard[0][0] == 'O'&& gameBoard[1][2] == 'O' && gameBoard [2][4] == 'O' ){
            System.out.println("Congrats, the Computer Won");
            computerScore++;
            return true;
        }

        if(gameBoard[2][0] == 'X'&& gameBoard[1][2] == 'X' && gameBoard [0][4] == 'X' ){
          System.out.println("Congrats, the Player Won");
            playerScore++;
            return true;
        }
        if(gameBoard[2][0] == 'O'&& gameBoard[1][2] == 'O' && gameBoard [0][4] == 'O' ){
            System.out.println("Congrats, the Computer Won");
            computerScore++;
            return true;
        }

        //tie no winner
        if(gameBoard[0][0] != '_' && gameBoard[0][2] != '_' && gameBoard[0][4] != '_' && gameBoard[1][0] !='_'&&
            gameBoard[1][2] != '_' && gameBoard[1][4] != '_' && gameBoard[2][0] != ' ' && gameBoard[2][2] != ' ' && gameBoard[2][4] != ' '){
            System.out.println("We have a time");
            return true;
        }

return false;}


}
