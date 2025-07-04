import java.util.Arrays;
import java.util.List;

public class Desafio13 {

    /**
     * Desafio 13 - Filtar os numeros que estão dentro de um intervalo
     * Utilize a Stream API para filtrar os numeros que estão dentro de um intervalo
     * específico ( por exemplo, entre 5 e 10) e exiba o resultado na console
     */

    public static void main(String[] args) {

        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Logica
        // filter -> Logica para pegar os numeros dentro do intervalo de 5-10, incluindo os numeros 5 e 10
        // distinct -> Utilizado para retirar os numeros repetidos.
        // toList -> Para adicionar na lista.
        List<Integer> dentroDoIntervalo = numeros.stream().filter(n -> n >= 5 && n <= 10).distinct().toList();

        // Exibindo na console
        System.out.println("Numeros entre 5 e 10: " + dentroDoIntervalo);

    }

}
