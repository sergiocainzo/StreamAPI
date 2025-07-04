import java.util.Arrays;
import java.util.List;

public class Desafio1 {

    /**
     * Desafio 1 - Mostre a lista na ordem numérica
     * Crie um programa que utilize a Stream API para ordenar a lista de numeros em
     * ordem crescente e a exiba no console
     * 
     */

    public static void main(String[] args) {

        // Atributo Lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Criando a ordenação em ordem crescente
        // Sorted -> Realiza a ordenação dos numeros
        // toList -> Realiza uma nova listagem dos numeros
        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

        // Exibindo na Tela
        System.out.println("Numeros Ordenados: " + numerosOrdenados);

    }

}
