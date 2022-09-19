import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Somatorio {

    public double executar(Double... numeros) {

        List<Double> output = Arrays.stream(numeros)
                .collect(Collectors.toList());

        return output.stream()
                .reduce(0d, (subtotal, element) -> subtotal + element);
    }
}
