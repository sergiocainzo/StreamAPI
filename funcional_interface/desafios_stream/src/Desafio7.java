import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {

    /**
     * Desafio 7 - Encontrar o segundo numero maior da lista
     * com a ajuda da Stream API, encontre o segundo maior numero da lista e exiba o
     * resultado no console
     */

    public static void main(String[] args) {

        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Realizando a lógica
        // distinct -> Remove elementos duplicados
        // sorted -> Organiza na ordem 'reversa'
        // skip -> Pula o primeiro elemento que seria o MAIOR
        // findFirst -> Pega o primeiro elemento restante no stream, onde será o segundo
        // maior.
        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        // Exibindo no console
        // adicionado o .get(), para pegar somente o valor se ele está presente.
        System.out.println("O segundo maior numero da lista é: " + segundoMaior.get());

        // Exibindo utilizando o IfPresent
        segundoMaior.ifPresent(valor -> System.out.println("Segundo maior: "+valor));
        

    }

}
