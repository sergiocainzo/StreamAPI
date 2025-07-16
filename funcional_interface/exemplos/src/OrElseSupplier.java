import java.util.Optional;

public class OrElseSupplier {

    public static void main(String[] args) {
        /**
         * O "orElseGet(supplier)", obtém o valor contido no Optional, ou retorna um
         * valor fornecido por um Supplier se o Optional estiver Vazio
         */

        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElseGet(() -> "Value from Supplier");
        System.out.println(result);

    }
}
