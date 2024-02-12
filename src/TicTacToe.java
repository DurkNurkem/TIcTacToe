import java.lang.reflect.Array;
import java.util.LinkedList;

/**** Project Name:
 ***** Created by: Ciaran McCallion
 ***** Creation date:
 ***** Last edited:
 ***** Project description:
 *****/
public class TicTacToe
{


//   public static int[][] updateBoard(int [][] pBoard)
//   {
//
//
//
//
//   }//updateBoard

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
   }




   public static void main(String[] args)
   {
      String [][] board = {{"1","2","3"},{"4","5","6",},{"7","8","9"}};
      printBoard(board);




   }//Main
}//class
