import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            result.add(0);
        }
        for (int i : arr) {
            result.set(i, result.get(i)+1);
        }
        return result;
    }
    public static void main(String[] args) {
        countingSort(null);
    }
}
