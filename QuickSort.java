import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    private List<Integer> arrayParaOrdenar = new ArrayList<>();

    public QuickSort() {
        this.arrayParaOrdenar.add(5);
        this.arrayParaOrdenar.add(1);
        this.arrayParaOrdenar.add(4);
        this.arrayParaOrdenar.add(2);
        this.arrayParaOrdenar.add(3);
    }

    public List<Integer> executar() {
        quicksort(0, arrayParaOrdenar.size() - 1);
        return arrayParaOrdenar;
    }

    private void quicksort(int start, int end) {
        if (start >= end)
            return;

        int pivot = partition(start, end);

        quicksort(start, pivot - 1);
        quicksort(pivot + 1, end);
    }

    private int partition(int start, int end) {
        int i = start;

        for (var j = start; j < end; j++) {
            if (arrayParaOrdenar.get(j) <= arrayParaOrdenar.get(end)) {
                swap(i++, j);
            }
        }
        swap(i, end);

        return i;
    }

    private void swap(int i, int j) {
        var k = arrayParaOrdenar.get(i);
        arrayParaOrdenar.set(i, arrayParaOrdenar.get(j));
        arrayParaOrdenar.set(j, k);
    }

}