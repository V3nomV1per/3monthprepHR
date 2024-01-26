import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = d; i < arr.size(); i++) {
            result.add(arr.get(i));
        }
        for (int i = 0; i < d; i++) {
            result.add(arr.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.err.println(List.of(1, 2, 3, 4, 5));
        System.out.println(rotateLeft(2, List.of(1, 2, 3, 4, 5)));
    }
}
