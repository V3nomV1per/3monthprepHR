import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            boolean ok = true;
            for (int j = 0; j < a.size() && ok; j++) {
                if (i%a.get(j) != 0) {
                    ok = false;
                }
            }
            for (int j = 0; j < b.size() && ok; j++) {
                if (b.get(j)%i != 0) {
                    ok = false;
                }
            }
            if (ok) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(2, 4));
        List<Integer> b = new ArrayList<>(List.of(24, 48));
        System.out.println(getTotalX(a, b));
    }
}