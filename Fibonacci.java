public class Fibonacci {

    public static void main(String[] args) {

        int n = 10; // número de termos que queremos

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {

            int c = a + b;
            System.out.print(" " + c);

            a = b;
            b = c;

        }

    }
}

