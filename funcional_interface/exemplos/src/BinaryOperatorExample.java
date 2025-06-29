import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    /**
     * Representa uma operação que combina dois argumentos do tipo T e retorna um
     * resultado do mesmo tipo T.
     * É usada para realizar operações de redução em pares de elementos, como somar
     * números ou combinar objetos.
     * 
     */

    public static void main(String[] args) {

        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5,6);

        // Usar o BinaryOperator com expressão lambda para somar dois numeros inteiros
        BinaryOperator<Integer> somar = Integer::sum;

        // Usar o BinaryOperator para somar todos os numeros no Stream
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }
}
