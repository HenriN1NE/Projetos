public class NumeroPrimo {

   public static boolean ehPrimo(int numero) {
      if (numero <= 1) {
         return false;
      }
      for (int i = 2; i <= Math.sqrt(numero); i++) {
         if (numero % i == 0) {
            return false;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      int numero = 7;
      if(ehPrimo(numero)) {
         System.out.println("O número " + numero + " é primo.");
      } else {
         System.out.println("O número " + numero + " não é primo.");
      }
   }
}

