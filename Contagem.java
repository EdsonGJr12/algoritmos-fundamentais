import java.util.ArrayList;
import java.util.List;

public class Contagem {

    private List<Double> arrayParaContar = new ArrayList<>();
    private static final Integer N = 10;

    public Contagem() {
        arrayParaContar.add(1d);
        arrayParaContar.add(2d);
        arrayParaContar.add(5.5d);
        arrayParaContar.add(-2d);
        arrayParaContar.add(10d);
        arrayParaContar.add(-85d);
    }

    public Integer executar() {
        Integer quantidade = 0;
        for (double elemento : arrayParaContar) {
            Double parteDecimal = ((int) elemento) - elemento;
            if (N > 0 && parteDecimal == 0 && elemento >= 1 && elemento <= N) {
                quantidade += 1;
            }

            if (N < 0 && parteDecimal == 0 && elemento <= 1 && elemento >= N) {
                quantidade += 1;
            }
        }

        return quantidade;
    }
}
