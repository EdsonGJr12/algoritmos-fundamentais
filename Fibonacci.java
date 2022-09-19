import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Double> arrayFibonacci = new ArrayList<>();
    private Somatorio somatorio = new Somatorio();

    public Fibonacci() {
        this.arrayFibonacci.add(0d);
        this.arrayFibonacci.add(1d);
        this.arrayFibonacci.add(1d);
        this.arrayFibonacci.add(2d);
        this.arrayFibonacci.add(3d);
        this.arrayFibonacci.add(5d);
        this.arrayFibonacci.add(8d);
        this.arrayFibonacci.add(13d);
    }

    public List<Double> aplicarFibonacci() {
        List<Double> ultimosDoisTermos = arrayFibonacci.subList(arrayFibonacci.size() - 2, arrayFibonacci.size());
        Double[] ultimosTermos = ultimosDoisTermos.toArray(new Double[0]);
        Double somatorioUltimosTermos = somatorio.executar(ultimosTermos);
        this.arrayFibonacci.add(somatorioUltimosTermos);
        return this.arrayFibonacci;
    }

}
