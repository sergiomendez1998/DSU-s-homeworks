package tiktactoegame;

public  class CreateGameBoard {

    public static void printGameBoard(char[][] gameBoard) {
        //generates the gameBoard
        for (char[] row : gameBoard) {
            for (char c: row){
                //draws the board without going on the second line
                  System.out.print(c);
            }
             //prints the complete line and goes to the next line
              System.out.println();
        }

    }


}
