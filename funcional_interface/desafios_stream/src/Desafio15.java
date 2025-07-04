import java.util.Arrays;
import java.util.List;

public class Desafio15 {

    /**
     * Desafio 15 - Verifique se a lista contém pelo menos um número negativo.
     * Utilizando a Stream API, verifique se a lista contém pelo menos um número
     * negativo e exiba o resultado no console
     */

    public static void main(String[] args) {

        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Lógica
        // anyMatch -> Verifica se a lista contem pelo menos um numero negativo.
        boolean resposta = numeros.stream().anyMatch(n -> n < 0);

        // Operador Ternário para a resposta
        String resultado = resposta ? "Sim" : "Não";

        // Exibição no console
        System.out.println("Existe algum número negativo na lista? " + resultado);

    }

}
