import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {
    
    public static String twoArrays(List<Integer> A, List<Integer> B, int k) {
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) < k) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(List.of(6, 1, 9));
        List<Integer> B = new ArrayList<>(List.of(9, 1, 4));
        System.out.println(twoArrays(A, B, 10));
        List<Integer> C = new ArrayList<>(List.of(1, 2, 2, 1));
        List<Integer> D = new ArrayList<>(List.of(3, 3, 3, 4));
        System.out.println(twoArrays(C, D, 5));
    }    
}