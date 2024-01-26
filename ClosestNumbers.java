import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> result = new ArrayList<>();
        int min = arr.get(arr.size()-1);
        for (int i = 0; i < arr.size() - 1; i++) {
            if (Math.abs(arr.get(i) - arr.get(i + 1)) < min) {
                min = Math.abs(arr.get(i) - arr.get(i + 1));
            }
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            if (Math.abs(arr.get(i) - arr.get(i + 1)) == min) {
                result.add(arr.get(i));
                result.add(arr.get(i + 1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(closestNumbers(Arrays.asList(5, 2, 3, 4, 1)));
        System.out.println(closestNumbers(Arrays.asList(-5, 15, 25, 71, 63)));
        System.out.println(closestNumbers(Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854)));
    }
}
