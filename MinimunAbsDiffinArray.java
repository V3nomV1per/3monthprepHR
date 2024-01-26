import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimunAbsDiffinArray {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Collections.sort(arr);
        int min = arr.get(arr.size() - 1);
        for (int i = 0; i < arr.size() - 1; i++) {
            if (Math.abs(arr.get(i) - arr.get(i+1)) < min) {
                min = Math.abs(arr.get(i) - arr.get(i+1));
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minimumAbsoluteDifference(Arrays.asList(-2, 2, 4)));
    }
}
