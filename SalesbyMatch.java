import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class SalesbyMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int pairs = 0;
        for (int i : ar) {
            if (map.isEmpty()) {
                map.put(i, 1);
                continue;
            } else {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                }
                map.putIfAbsent(i, 1);
            }
        }
        Collection<Integer> values = map.values();
        for (int i : values) {
            pairs += i / 2;
        }
        return pairs;
    }

    public static void main(String[] args) {
        List<Integer> socks1 = new ArrayList<>(List.of(10, 10, 10, 10, 20, 20, 20, 30, 50));
        System.out.println(sockMerchant(9, socks1));
        List<Integer> socks2 = new ArrayList<>(List.of(1, 2, 1, 2, 1, 3, 2));
        System.out.println(sockMerchant(9, socks2));
    }
}
