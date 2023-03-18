import java.util.HashMap;

public class Contagem {

    public static void main(String[] args) {
        int[] meuArray = {1, 2, 2, 3, 3, 3};

        HashMap<Integer, Integer> contagem = new HashMap<Integer, Integer>();

        // Loop pelo array e contar cada elemento
        for (int i = 0; i < meuArray.length; i++) {
            int elemento = meuArray[i];
            if (contagem.containsKey(elemento)) {
                contagem.put(elemento, contagem.get(elemento) + 1);
            } else {
                contagem.put(elemento, 1);
            }
        }

        // Imprime a contagem de cada elemento
        for (int elemento : contagem.keySet()) {
            System.out.println(elemento + ": " + contagem.get(elemento));
        }
    }
}

