import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> count = new ArrayList<>(List.of(0, 0, 0, 0, 0));
        for (int i : arr) {
            count.set(i - 1, count.get(i - 1) + 1);
        }
        int maxVal = count.get(0), maxIndex = 0;
        for (int i = 4; i >= 0; i--) {
            if (maxVal <= count.get(i)) {
                maxVal = count.get(i);
                maxIndex = i;
            }
        }
        return maxIndex + 1;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4));
        System.out.println(migratoryBirds(arr));
    }
}
