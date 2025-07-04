import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    /**
     * Representa uma operação que aceita um argumento do tipo T e não retorna
     * nenhum resultado.
     * É utilizada principalmente para realizar ações, os efeitos colaterais nos
     * elementos do Stream sem modificar, ou retornar * um valor.
     */

    public static void main(String[] args) {

        // Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Usar o Consumer com expressões Lambda para imprimir números pares.
        // Consumer<Integer> imprimirNumeroPar = numero -> {
        //     if (numero % 2 == 0) {
        //         System.out.println(numero);
        //     }
        // };

        // Usar o Consumer para imprimir numeros pares no Stream
        numeros.stream()
                .filter(p -> p % 2 == 0)
                .forEach(System.out::println);

    }
}
