import java.util.List;

public class AlgoritmosFundamentais {

    public static void main(String[] args) {
        System.out.println(new NumeroPrimo().isNumeroPrimo(3));

        System.out.println();
        System.out.println();

        System.out.println(new Somatorio().executar(1d, 2d, 3d));

        System.out.println();
        System.out.println();

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.aplicarFibonacci();
        fibonacci.aplicarFibonacci();
        List<Double> array = fibonacci.aplicarFibonacci();
        array.forEach(System.out::println);

        System.out.println();
        System.out.println();

        System.out.println(new MaximoDivisorComum().executar(5, 10));

        System.out.println();
        System.out.println();

        System.out.println(new Contagem().executar());

        System.out.println();
        System.out.println();

        List<Integer> arrayOrdenado = new QuickSort().executar();
        arrayOrdenado.forEach(System.out::println);

    }
}