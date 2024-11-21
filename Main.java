public class Main {

   public static void main(String []args) {
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
      String xs = "Tomorrow we're going to Paris";
      String xsr = "";
      String ithLetter;
      for (int i = 0; i < xs.length(); i++) {
         ithLetter = xs.substring(i, i+1);
         xsr = ithLetter + xsr;
      }
      System.out.println(xs + " reversed is " + xsr);
   }
}
