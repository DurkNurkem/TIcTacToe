import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Scanner;

/**** Project Name: TicTacToe
 ***** Created by: Ciaran McCallion
 ***** Creation date: 13/02/2024
 ***** Last edited: 14/02/2024
 ***** Project description: A game of tictactoe against a computer
 *****/
public class TicTacToe
{

   public static void haveAGo(String [][] pBoard, String pGoAttempt, boolean pRealPlayer)
   {

      boolean spaceFree = false;

      do
      {
         for (int j = 0; j < 3; j++)
         {
            for (int x = 0; x < 3; x++)
            {
               if (pGoAttempt.equals(pBoard[j][x]))
               {
                  spaceFree = true;
                  if (pRealPlayer)
                  {
                     pBoard[j][x] = "o";
                  }//if
                  else pBoard[j][x] = "x";
               }//if
            }//for
         }//for
         if(!spaceFree && !pRealPlayer)
         {
            pGoAttempt=computerGo();
         }
         else if (!spaceFree && pRealPlayer)
         {
            System.out.println("That space is already taken!");
            pGoAttempt=playerGo();
         }
      }//do
      while(!spaceFree);
   }//haveAGo()

   public static void printBoard(String[][] pBoard)
   {
      System.out.println("+---+---+---+");
      for (int j = 0; j<3; j++)
      {
         for (int x=0; x<3; x++)
         {
            System.out.print("| "+pBoard[j][x]+" ");
         }//for
         System.out.print("|\n");
         System.out.println("+---+---+---+");
      }//for
   }//printBoard()

   public static String computerGo()
   {
      int max = 9;
      int min = 1;
      int range = max - min + 1;
      int goInt = (int) (Math.random() * range) + min;

      return String.valueOf(goInt);
   }//computerGo()

   public static String playerGo()
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.print("Please choose your move: ");

      return String.valueOf(keyboard.next());
   }//playerGo()


   public static boolean checkWinner(String[][] pBoard)
   {
      if(pBoard[0][0].equals("x") && pBoard[0][1].equals("x") && pBoard[0][2].equals("x") || pBoard[1][0].equals("x") && pBoard[1][1].equals("x") && pBoard[1][2].equals("x") || pBoard[2][0].equals("x") && pBoard[2][1].equals("x") && pBoard[2][2].equals("x") || pBoard[0][0].equals("x") && pBoard[1][0].equals("x") && pBoard[2][0].equals("x") || pBoard[0][1].equals("x") && pBoard[1][1].equals("x") && pBoard[2][1].equals("x") || pBoard[0][2].equals("x") && pBoard[1][2].equals("x") && pBoard[2][2].equals("x") || pBoard[0][0].equals("x") && pBoard[1][1].equals("x") && pBoard[2][2].equals("x") || pBoard[2][0].equals("x") && pBoard[1][1].equals("x") && pBoard[0][2].equals("x"))
      {
         return true;
      }//if
      else if(pBoard[0][0].equals("o") && pBoard[0][1].equals("o") && pBoard[0][2].equals("o") || pBoard[1][0].equals("o") && pBoard[1][1].equals("o") && pBoard[1][2].equals("o") || pBoard[2][0].equals("o") && pBoard[2][1].equals("o") && pBoard[2][2].equals("o") || pBoard[0][0].equals("o") && pBoard[1][0].equals("o") && pBoard[2][0].equals("o") || pBoard[0][1].equals("o") && pBoard[1][1].equals("o") && pBoard[2][1].equals("o") || pBoard[0][2].equals("o") && pBoard[1][2].equals("o") && pBoard[2][2].equals("o") || pBoard[0][0].equals("o") && pBoard[1][1].equals("o") && pBoard[2][2].equals("o") || pBoard[2][0].equals("o") && pBoard[1][1].equals("o") && pBoard[0][2].equals("o"))
      {
         return true;
      }//else-if
      else return false;
   }//checkWinner()

   public static void main(String[] args)
   {

      boolean winnerFound = false, realPlayerTurn = false;

      String [][] board = {{"7","8","9"},{"4","5","6",},{"1","2","3"}};
      haveAGo(board, computerGo(), realPlayerTurn);
      printBoard(board);

      while(!winnerFound)
      {
         if(!realPlayerTurn)
         {
            realPlayerTurn=true;
            haveAGo(board, playerGo(), realPlayerTurn);
            winnerFound=checkWinner(board);
         }
         else
         {
            realPlayerTurn = false;
            haveAGo(board, computerGo(), realPlayerTurn);
            printBoard(board);
            winnerFound=checkWinner(board);

         }
      }//while

      if (realPlayerTurn)
      {
         System.out.println("Congradulations! YOU WON!");
      }
      else System.out.println("Sorry you lost chump!");printBoard(board);


   }//Main
}//class
