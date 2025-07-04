import java.util.Arrays;
import java.util.List;

public class Desafio12 {

    /**
     * Desafio 12 - Encontre o produto de todos os numeros da lista
     * Com a ajuda da Stream API, encontre o produto de todos os numeros da lista e
     * exiba o resultado no console
     */

    public static void main(String[] args) {

        // Lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Logica
        // reduce -> Usado para calcular o produto
        // 1 -> Valor inicial para multiplicação é 1
        // O Acumulador é a função (a,b) -> a*b, que multiplica o resultado acumulado pelo próximo número
        long produto = numeros.stream().reduce(1, (a, b) -> a * b);

        // Exibindo na console
        System.out.println("O produto de todos os números da lista é: "+produto);

    }

}
