import java.util.Arrays;
import java.util.List;

public class Desafio10 {

    /**
     * Desafio 10 - Adrupe os valores impares multiplos de 3 ou de 5;
     * Utilize a Stream API para agrupar os valores impares multiplos de 3 ou de 5 e
     * exiba o resultado no console
     */

    public static void main(String[] args) {

        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Logica 1
        // Filter -> Filtra os numeros Impares dos Pares
        // toList -> Adiciona numa nova lista
        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).toList();

        // Logica 2
        // Filter -> Filtra os numeros divididos por 3 e 5
        // toList -> adiciona numa nova lista
        List<Integer> imparesTresCinco = numerosImpares.stream().filter(n -> n % 3 == 0 || n % 5 == 0).toList();

        // Exibe na console os multiplos de 3 e 5
        System.out.println("Numeros Impares multiplos por 3 e 5: " + imparesTresCinco);

    }

}
