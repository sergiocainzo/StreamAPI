import java.util.Arrays;
import java.util.List;

public class Desafio16 {

    /**
     * Desafio 16 - Agrupe os numeros em PARES e IMPARES
     * Utilize a Stream API para agrupar os numeros em duas listas separadas, uma
     * contendo os numeros pares e a outra contendo os numeros impares da lista
     * original, e exiba os resultados no console
     */

    public static void main(String[] args) {

        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Lista dos numeros PARES
        // Filter -> Realizar a filtragem da lógica
        // Distinct -> Retirar os elementos repetidos da lista
        // toList -> Adicionar na lista stream
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).distinct().toList();

        // Lista dos numeros IMPARES
        // Filter -> Realizar a filtragem da lógica
        // Distinct -> Retirar os elementos repetidos da lista
        // toList -> Adicionar na lista stream
        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).distinct().toList();

        // exibindo na console os numeros pares
        System.out.println("Numeros PARES: " + numerosPares);

        // Exibindo na console os numeros imprares
        System.out.println("Numeros IMPARES: "+numerosImpares);

    }

}
