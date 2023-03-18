
public class MDC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Solicita que o usuário insira os dois números
        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        
        // Chama o método calcularMDC para encontrar o MDC dos dois números
        int mdc = calcularMDC(num1, num2);
        
        // Imprime o resultado na tela
        System.out.println("O MDC de " + num1 + " e " + num2 + " é " + mdc);
    }
    
    // Define o método calcularMDC para encontrar o MDC usando o algoritmo de Euclides
    public static int calcularMDC(int num1, int num2) {
        // Verifica se o segundo número é igual a zero, se for, retorna o primeiro número
        if (num2 == 0) {
            return num1;
        } else {
            // Se o segundo número não for zero, chama o método calcularMDC novamente
            // passando o segundo número como primeiro argumento e o resto da divisão
            // do primeiro número pelo segundo número como segundo argumento
            return calcularMDC(num2, num1 % num2);
        }
    }
}

