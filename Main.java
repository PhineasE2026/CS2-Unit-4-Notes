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
   }
}
