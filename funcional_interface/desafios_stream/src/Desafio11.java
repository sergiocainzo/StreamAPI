import java.util.Arrays;
import java.util.List;

public class Desafio11 {

    /**
     * Desafio 11 - Encontre a soma dos quadrados de todos os numeros da lista
     * Utilizando a Stream API, encontre a soma dos quadrados de todos os numeros da
     * lista e exiba o resultado no console
     */

    public static void main(String[] args) {

        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Lógica
        // mapToInt -> Faz o calculo dos quadrados dos valores da lista
        // sum -> Faz o calculo da soma dos numeros da lista
        int somaDosQuadrados = numeros.stream().mapToInt(n -> n * n).sum();

        // Exibir no console
        System.out.println("A soma dos quadrados de cada número: " + somaDosQuadrados);

    }

}
