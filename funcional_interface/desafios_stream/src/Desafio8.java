import java.util.Arrays;
import java.util.List;

public class Desafio8 {

    /**
     * Desafio 8 - Somar os dígitos de todos os numeros da lista.
     * Utilizando a Stream API, realize a soma dos dígitos de todos os numeros da
     * lista e exiba o resultado no console
     */

    public static void main(String[] args) {

        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Lógica no Steam
        // mapToInt -> converte cada numero para um IntStream
        // string.valueOf -> converte o numero para String
        // chars -> pega o Int dos valores dos characteres
        // map -> Converte cada CHAR para seu valor numérico
        // sum -> Faz a soma dos numeros da lista.
        // segundo sum-> Soma todos os resultados das somas de dígitos individuais
        int resultado = numeros.stream().mapToInt(n -> String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum())
                .sum();

        // Exibindo no console
        System.out.println("A soma dos números é: " + resultado);

    }

}
