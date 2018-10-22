
public class Assignment3 {

      public static int printPowersOfN (int base, int exponent) {

          int result = 1;

          for (int i = 1; i <= exponent; i++) {
        	  System.out.print(result);
        	  System.out.print(" ");
        	  
              result *=base;

          }

          return result;

     }

     public static void main(String[] args) {

          System.out.println(printPowersOfN(4, 3));
          System.out.println(printPowersOfN(5, 6));
          System.out.println(printPowersOfN(-2, 8));

     }

}
