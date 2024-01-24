import java.util.ArrayList;
import java.util.List;

public class RecordBreaker {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> res = new ArrayList<Integer>();
        int max = scores.get(0);
        int min = scores.get(0);
        res.add(0);
        res.add(0);
        for (int i : scores) {
            if (i>max) {
                res.set(0, res.get(0)+1);
                max = i;
                continue;
            }
            if (i<min) {
                res.set(1, res.get(1)+1);
                min = i;
                continue;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<Integer>();
        scores.add(12);
        scores.add(10);
        scores.add(24);
        scores.add(24);
        System.out.println(breakingRecords(scores));
    }
}
