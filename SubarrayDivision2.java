import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision2 {

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0, sum = 0, window = 0;
        for (int i = 0; i < s.size() - m + 1; i++) {
            for (window = i; window < i + m; window++) {
                sum += s.get(window);
            }
            if (sum == d) {
                count++;
            }
            sum = 0;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(List.of(2, 2, 1, 3, 2, 1));
        System.out.println(birthday(s, 4, 2));
    }
}
