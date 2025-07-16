import java.util.Arrays;
import java.util.List;

public class Desafio17 {

    /**
     * Desafio 17 - Filter os números primos da lista
     * Com a ajuda da Stream API, filtre os números primos da lista e exiba o
     * resultado no console
     * 
     */

    public static boolean isPrime(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Atributo da lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Lógica
        // Filter -> Vai realizar a filtragem dos números primos
        // Distinct -> Vai remover os números repetidos
        // toList -> Vai adicionar a uma nova lista
        List<Integer> primos = numeros.stream()
                .filter(Desafio17::isPrime)
                .distinct()
                .toList();

        // Exibir na tela
        System.out.println("Números primos encontrados: " + primos);

    }
}
