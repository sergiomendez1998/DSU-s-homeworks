package tiktactoegame;

import java.util.Random;
import java.util.Scanner;

public class PlayerMove {

    static Scanner input = new Scanner(System.in);


    public static void playerIsMoving(char [][] gameBoard){

        /*
        Player chooses a number from 1 to 9
     */
     System.out.println("Please make a move. Numbers available (1-9)");


    int move = input.nextInt();

    boolean result = isValidMove(move,gameBoard);

     /*
     While the player is moving, and there the position is not occupied by  the player's number input
     */
    while(!result){
        System.out.println("Sorry! Invalid Move. Try again");
        move = input.nextInt();
        result = isValidMove(move,gameBoard);
    }

    /*
      we get the player's number to know which position is occupied by the computer
     */
    System.out.println("Player has already moved at position " + move);
    UpdateBoard.changeBoard(move,1,gameBoard);

    }

    /*
      this method verifies if number (position) input by the players
      is still valid or was not selected by the computer.
      Avoid repeating numbers in the input
     */
    public static boolean isValidMove(int move, char[][] gameBoard){
    /*
         this  a graphic example
         we have rows and columns
               C0, c1, c2, c3, c4
        row0   0   |   2   |   4
        row1   0   |   2   |   4
        row2   0   |   2   |   4

         */

    switch (move){
        case 1:
            if(gameBoard[0][0] == '_'){
                return true;
            } else{
                return false;
            }
        case 2:
            if(gameBoard[0][2] == '_'){
                return true;
            } else{
                return false;
            }
        case 3:
            if(gameBoard[0][4] == '_'){
                return true;
            } else{
                return false;
            }

        case 4:
            if(gameBoard[1][0] == '_'){
                return true;
            } else{
                return false;
            }
        case 5:
            if(gameBoard[1][2] == '_'){
                return true;
            } else{
                return false;
            }
        case 6:
            if(gameBoard[1][4] == '_'){
                return true;
            } else{
                return false;
            }
        case 7:
            if(gameBoard[2][0] == ' '){
                return true;
            } else{
                return false;
            }
        case 8:
            if(gameBoard[2][2] == '_'){
                return true;
            } else{
                return false;
            }
        case 9:
            if(gameBoard[2][4] == ' '){
                return true;
            } else{
                return false;
            }

        default:
            return false;
    }

}

public static void computerIsMoving(char [][] gameBoard){

    Random rand = new Random();

    /*
     CPU generates random numbers between 0 and 9,
     starting from 1
     */
    int move = rand.nextInt(9)+1;

    boolean result = isValidMove(move,gameBoard);

    /*
     While the computer is moving, and there the position is not occupied by  the computer's number input
     */
    while(!result){
        move = rand.nextInt(9)+1;
        result = isValidMove(move, gameBoard);
    }

    /*
      we get the computer's number to know which position is occupied by the computer
     */
    System.out.println("Computer has already moved at position "+ move);
    UpdateBoard.changeBoard(move,2,gameBoard);
}







}
