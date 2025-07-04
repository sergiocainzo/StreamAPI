import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio14 {

    /**
     * Desafio 14 - Encontre o maior numero primo da lista
     * Com a Stream API, encontre o maior numero primo da lista e exiba o resultaado
     * no console
     */

    // Verifica se o numero é primo
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

        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Logica
        // Filter -> Implementando o metodo "isPrime"
        // Distinct -> Remover os numeros repetidos
        // Max(Comparator.naturalOrder()) -> Para encontrar o maior numero primo
        Optional<Integer> primos = numeros.stream().filter(Desafio14::isPrime).distinct().max(Comparator.naturalOrder());

        // Exibir na console
        // Adicionado o .get() para retirar o 'Optional' no momento de exibição na console
        if (primos.isPresent()) {
            System.out.println("Numeros Primos: " + primos.get());
        } else {
            System.out.println("Não foi encontrado nenhum número primo.");
        }

    }

}
