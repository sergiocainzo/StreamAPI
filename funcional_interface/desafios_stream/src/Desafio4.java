import java.util.Arrays;
import java.util.List;

public class Desafio4 {

    /**
     * Desafio 4 - Remova todos os valores impares
     * Utilize a Stream API para remover os valores ímpares da lista e imprima a
     * lista resultante no console
     */

    public static void main(String[] args) {

        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Removendo os valores pares da lista
        // filter -> faz a filtragem da lógica
        // toList -> Adiciona numa nova lista
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();

        // Exibição do resultado
        System.out.println("Lista de numeros PARES: " + numerosPares);

    }

}
