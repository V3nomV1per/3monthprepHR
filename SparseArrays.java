import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<Integer>();
        int n = queries.size();
        while(n!=0) {
            result.add(0);
            n--;
        }
        int k = 0;
        for (String q : queries) {
            for (String check : strings) {
                if (q.equals(check)) {
                    result.set(k, result.get(k)+1);
                }
            }
        }
        return result;
    }
}
