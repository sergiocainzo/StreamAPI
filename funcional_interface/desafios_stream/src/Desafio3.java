import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    /**
     * Desafio 3 - Verifique se todos os numeros da lista são positivos
     * Com a ajuda da Stream API, verifique se todos os numeros da lista são
     * positivos e exiba o resultado no console.
     */
    public static void main(String[] args) {
        // Lista de numero
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificando se a lista é positiva
        // allMatch -> Realiza a verificação do predicator para ver se todos os numeros são positivos(acima de 0) seu retorno é um boolean
        boolean numerosPositivos = numeros.stream().allMatch(n -> n > 0);

        // Operador Ternário para converter boolean em String
        String resultado = numerosPositivos ? "Sim" : "Não";

        // Exibindo na console
        System.out.println("Numeros da lista são Positivos: " + resultado);

    }
}
