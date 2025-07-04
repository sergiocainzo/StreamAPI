import java.util.Arrays;
import java.util.List;

public class Desafio9 {

    /**
     * Desafio 9 -Verificar se todos os numeros da lista são distintos(não se
     * repetem)
     * Com a Stream API, verifique se todos os numeros da lista são distintos(não se
     * repetem) e exiba o resultado no console
     */

    public static void main(String[] args) {
        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se existe
        // distinct -> Verifica se existe elemento repetido na lista
        // count -> retorna a quantidade de elementos dentro da lista
        long distintos = numeros.stream().distinct().count();

        // Compara se as 2 listas estão com o mesmo tamanho de elementos.
        boolean saoTodosDistintos = numeros.size() == distintos;

        // Exibição no console
        if (saoTodosDistintos) {
            // Caso não tenha nenhum número repetido
            System.out.println("Todos os números na lista são distintos");
        } else {
            // Caso tenha número repetido
            System.out.println("A lista contem números repetidos");
        }

    }

}
