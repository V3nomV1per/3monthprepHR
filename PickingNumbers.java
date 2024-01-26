import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
        for (int key : map.keySet()) {
            int currentCount = map.get(key);
            int nextCount = map.getOrDefault(key + 1, 0);
            max = Math.max(max, currentCount + nextCount);
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(4, 97, 5, 97, 97, 4, 97, 4, 97, 97, 97, 97, 4, 4, 5, 5, 97, 5, 97, 99,
                4, 97, 5, 97, 97, 97, 5, 5, 97, 4, 5, 97, 97, 5, 97, 4, 97, 5, 4, 4, 97, 5, 5, 5, 4, 97, 97, 4, 97, 5,
                4, 4, 97, 97, 97, 5, 5, 97, 4, 97, 97, 5, 4, 97, 97, 4, 97, 97, 97, 5, 4, 4, 97, 4, 4, 97, 5, 97, 97,
                97, 97, 4, 97, 5, 97, 5, 4, 97, 4, 5, 97, 97, 5, 97, 5, 97, 5, 97, 97, 97));
        System.out.println(pickingNumbers(a));
        List<Integer> b = new ArrayList<>(List.of(66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66,
                66, 66, 66, 66, 66, 66));
        System.out.println(pickingNumbers(b));
    }
}
