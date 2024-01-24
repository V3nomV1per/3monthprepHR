import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPairs (int n, int k, List<Integer> ar) {
        Collections.sort(ar);
        int c = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i+1; j < ar.size(); j++) {
                if ((ar.get(j) + ar.get(i)) % k == 0) {
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<Integer>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);
        int k = 3;
        System.out.println(divisibleSumPairs(ar.size(), k, ar));
    }
}
