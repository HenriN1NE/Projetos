public class ExemploSomatorio {
    public static void main(String[] args) {
        int n = 5; // definimos o valor de n como 5
        int soma = 0; // inicializamos a variável soma como 0
        
        // usamos um loop for para somar os valores de 1 a n
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        
        System.out.printf("O somatório dos números de 1 a %d é %d.", n, soma);
    }
}

