import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Desafio18 {
    /**
     * Desafio 18 - Verifique se todos os números da lista são iguais
     * Utilizando a Stream API, verifique se todos os números da lista são iguais e
     * exiba o resultado no console
     */

    public static void main(String[] args) {

        // Lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Lógica
        // Criação de um SET(conjunto) pois ele não aceita números repetidos
        // AnyMath -> Vai realizar o add no set, se ele identificar que o elemento já
        // foi adicionado, ele vai encerrar e retornar informando que o número já foi
        // adicionado.
        Set<Integer> set = new HashSet<>();
        boolean numerosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.get(0)));

        // Operador Ternário
        String resposta = numerosIguais ? "Sim" : "Não";

        // Exibição na tela
        System.out.println("Todos os elementos da Lista são idênticos? " + resposta);

    }
}
