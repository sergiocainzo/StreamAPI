import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {

    /**
     * Desafio 5 - Calcule a media dos numeros maiores que 5
     * Com a Stream API, calcule a media dos numeros maiores que 5 e exiba o
     * resultado no console
     */

    public static void main(String[] args) {
        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Logica para coletar os numeros acima de 5
        // filter -> Faz a logica
        // tolist -> Adiciona numa nova lista
        List<Integer> maioresQueCinco = numeros.stream().filter(n -> n > 5).toList();

        // Calculando a media dos numeros maiores que 5
        OptionalDouble resultado = maioresQueCinco.stream().mapToInt(Integer::intValue).average();

        // Exibindo na console
        System.out.println("Lista dos numeros acima de 5: " + maioresQueCinco);

        // Modo de tirar o OptionalDouble da exibição.
        resultado.ifPresent(media -> System.out.println("Média dos numeros: " + media));

    }

}
