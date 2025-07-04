import java.util.Arrays;
import java.util.List;

public class Desafio2 {

    /**
     * Desafio 2 - Imprima a soma dos numeros pares da lista
     * Utilizando a Stream API, realize a soma dos numeros pares da lista e exiba o
     * resultado no console
     */

    public static void main(String[] args) {

        // Atributo com a Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Criando a Stream API
        // Sorted -> ordenação da lista
        // filter -> faz a filtragem da lógica
        // toList -> Cria uma nova lista
        List<Integer> somarNumerosPares = numeros.stream().sorted().filter(n -> n % 2 == 0).toList();

        // Calculando a soma dos numeros pares
        // mapToInt -> faz a conversão dos valores para inteiro/double/long
        // sum -> faz a soma dos valores da lista
        int resultado = somarNumerosPares.stream()
                .mapToInt(Integer::intValue)
                .sum();

        // Exibir na tela
        System.out.println("Numeros Pares: " + somarNumerosPares);
        System.out.println("Os numeros Pares somados da: " + resultado);
    }
}
