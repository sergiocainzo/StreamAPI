import java.util.Optional;

public class OrElseDefaultValue {
    public static void main(String[] args) {
        /**
         * O "orElse("Default")", Obtém o valor no Optional, ou retorna um valor padrão se o optional estiver Vazio.
         */
        
        Optional<String> optionalValue = Optional.ofNullable(null);
        String resultado = optionalValue.orElse("Default");
        System.out.println(resultado);
    }
}
