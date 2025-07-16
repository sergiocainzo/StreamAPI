import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    /**
     * Desafio 19 -> Encontre a soma dos números divisíveis por 3 e 5
     * Com a Stream API,encontre a soma dos números da lista que são divisíveis
     * tanto por 3 quanto por 5 e exiba o resultado no console
     */
    public static void main(String[] args) {
        // List
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Lógica
        // Filter -> Vamos realizar a filtragem dos números divididor por 3 e 5 na lista
        // Distinct -> Vamos remover os números repetidos
        // toList -> Vamos adicionar a uma lista
        List<Integer> novaLista = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .distinct()
                .toList();

        int resultado = novaLista.stream().mapToInt(Integer::intValue).sum();

        // Exibição na Console
        if (novaLista.isEmpty()) {
            System.out.println("Os numeros que divisíveis por 3 e 5 são: " + "Lista está Vazia");
        } else {
            System.out.println("Os numeros que divisíveis por 3 e 5 são: " + novaLista);
        }
        
        System.out.println("A soma destes número é: " + resultado);

    }
}
