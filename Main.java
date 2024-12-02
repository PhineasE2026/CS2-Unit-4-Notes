import java.util.Scanner;
public class Main {

   public static void main(String []args) {
      Scanner scan = new Scanner(System.in);
      for (int i = 0; i < 2; i++) {
         System.out.println("aeiou");
      }
      int x = 0;
      while (x != 10) {
         x++;
         System.out.println(x);
      }
      boolean condition = true;
      while (condition) {
         condition = false;
      }
      for (int y = 15; y > 0; y--) {
         System.out.println("AH!");
      }
      int z = 1255500000;
      while (z > 5) {
         z = z/5;
         System.out.println(z);
         z++;
      }
      double g = 1234567891;
      while (g > 10) {
         g = g / 2;
         System.out.println(g);
         g = g * 1.5;
      }
      String message = "Have a 1ong and happy 1ife";
      int index = 0;

      while (message.indexOf("1") >= 0)
      {
         // Find the next index for 1
         index = message.indexOf("1");
         System.out.println("Found a 1 at index: " + index);
         // Replace the 1 with a l at index by concatenating substring up to
         // index and then the rest of the string.
         String firstpart = message.substring(0, index);
         String lastpart = message.substring(index + 1);
         message = firstpart + "l" + lastpart;
         System.out.println("Replaced 1 with l at index " + index);
         System.out.println("The message is currently " + message + " but we aren't done looping yet!");
      }
      System.out.println("Cleaned text: " + message);
      String exm = "5unn1es h0p a 10t";
      int f = 0;
      while (f < 5) {
         if (f <= 1) {
            index = exm.indexOf("1");
         }
         else if (f == 2) {
            index = exm.indexOf("5");
         }
         else {
            index = exm.indexOf("0");
         }
         System.out.println("Found a number at index: " + index);
         String firstHalf = exm.substring(0, index);
         String secondHalf = exm.substring(index + 1);
         if (f == 0) {
            exm = firstHalf + "i" + secondHalf;
         }
         else if (f == 1) {
            exm = firstHalf + "l" + secondHalf;
         }
         else if (f == 2) {
            exm = firstHalf + "b" + secondHalf;
         }
         else {
            exm = firstHalf + "o" + secondHalf;
         }
         System.out.println("Replaced number with correct letter");
         System.out.println("The message is currently " + exm + " but we aren't done looping yet!");
         f++;
      }
      System.out.println("Cleaned text: " + exm);
      String xs = "Tomorrow we're going to Paris, and we're gonna go to the moon afterwards";
      String xsr = "";
      String ithLetter;
      for (int i = 0; i < xs.length(); i++) {
         ithLetter = xs.substring(i, i+1);
         xsr = ithLetter + xsr;
      }
      System.out.println(xs + " reversed is " + xsr);
      for (int row = 1; row <= 3; row++) {
         for (int col = 1; col <= 5; col++) {
            System.out.print("*");
         }
         System.out.println();
      }
      int var1 = 3;
      int var2 = 2;

      while ((var2 != 0) && ((var1 / var2) >= 0))
      {
         var1 = var1 + 1;
         var2 = var2 - 1;
      }
      for (int i = 3; i < 7; i++)
      {
         System.out.print("*");
      }
      System.out.println("\n\n");
      for (int row = 0; row < 5; row++)
      {
         for (int col = 0; col < 10; col++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println("\n\n");
      System.out.println("Enter the number of rows");
      int numRows = scan.nextInt();
      System.out.println("Enter the number of columns");
      int numCols = scan.nextInt();
      System.out.println("\n\n");
      for (int row = 0; row < numRows; row++) {
         for (int col = 0; col < numCols; col++) {
            if ((row > 0) && (row < (numRows - 1))) {
               if ((col >= 2) && (col <= (numCols - 3))) {
                  System.out.print("0");
               }
               else {
                  System.out.print("1");
               }
            }
            else {
               System.out.print("1");
            }
         }
         System.out.println();
      }
      System.out.println("continue");
      int move = scan.nextInt();
      System.out.println(move + "\n\n");
      int incRows = 2;
      int incCols = 4;
      for (int i = 0; i < 8; i++) {
         for (int row = 0; row < incRows; row++) {
            for (int col = 0; col < incCols; col++) {
               if ((row > 0) && (row < (incRows - 1))) {
                  if ((col >= 2) && (col <= (incCols - 3))) {
                     System.out.print("0");
                  }
                  else {
                     System.out.print("1");
                  }
               }
               else {
                  System.out.print("1");
               }
            }
            System.out.println();
         }
         incRows++;
         incCols = incRows*2;
      }
   }
}
