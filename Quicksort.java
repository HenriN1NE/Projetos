public class Quicksort {
    public static void main(String[] args) {
        int[] meuArray = {5, 3, 6, 2, 10};
        quicksort(meuArray, 0, meuArray.length - 1);
        System.out.println(Arrays.toString(meuArray)); // Imprime [2, 3, 5, 6, 10]
    }

    public static void quicksort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            // Encontra o índice do pivô
            int indicePivo = particiona(array, inicio, fim);

            // Ordena recursivamente o subarray à esquerda do pivô
            quicksort(array, inicio, indicePivo - 1);

            // Ordena recursivamente o subarray à direita do pivô
            quicksort(array, indicePivo + 1, fim);
        }
    }

    public static int particiona(int[] array, int inicio, int fim) {
        int pivo = array[inicio];
        int i = inicio + 1;
        int j = fim;

        while (i <= j) {
            // Encontra o primeiro elemento à direita do pivô menor que o pivô
            while (i <= j && array[i] <= pivo) {
                i++;
            }

            // Encontra o primeiro elemento à esquerda do pivô maior que o pivô
            while (i <= j && array[j] > pivo) {
                j--;
            }

            // Troca os elementos encontrados acima
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Coloca o pivô na posição correta
        int temp = array[inicio];
        array[inicio] = array[j];
        array[j] = temp;

        return j;
    }
}

