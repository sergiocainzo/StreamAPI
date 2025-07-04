import java.util.Arrays;
import java.util.List;

public class Desafio6 {

    /**
     * Desafio 6 - Verificar se a lista contém algum número maior que 10
     * Utilize a Stream API para verificar se a lista contém algum número maior que
     * 10 e exiba o resultado no console
     */

    public static void main(String[] args) {

        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificação se existe algum numero maior que 10 na lista
        // anyMatch -> Realiza a verifica para ver se pelo menos 1 elemento da lista atende a condição e seu retorno é um boolean.
        boolean resultado = numeros.stream().anyMatch(n -> n > 10);

        // Operador Ternário para conversão de Boolean para String
        String respostaResultado = resultado ? "Sim" : "Não";

        // Exibindo na console
        System.out.println("Existe algum número maior que 10? " + respostaResultado);

    }

}
