import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um
 * resultado do tipo R.
 * É utilizada para transformar ou apear os elementos do Stream em outros
 * valores ou tipos.
 */

public class FunctionExample {

    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar a Function com expressões lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usar a função para dobrar todos os numeros no Stream e armazená-los em outra
        // lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        // Imprimir a lista de numeros dobrados
        numerosDobrados.forEach(System.out::println);
    }

}
