import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle {
    
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        Collections.sort(sticks);
        List<List<Integer>> validTriangle = new ArrayList<>();
        for (int i = 0; i < sticks.size() - 2; i++) {
            for (int j = i + 1; j < sticks.size() - 1; j++) {
                int k = j + 1;
                while (k < sticks.size() && sticks.get(i) + sticks.get(j) > sticks.get(k)) {
                    validTriangle.add(List.of(sticks.get(i), sticks.get(j), sticks.get(k)));
                    k++;
                }
            }
        }
        int max = 0;
        List<Integer> maxTriangle = new ArrayList<>();
        for (List<Integer> triangles : validTriangle) {
            int s = triangles.stream().mapToInt(Integer::intValue).sum();
            if (max<s) {
                max = s;
                maxTriangle = triangles;
            }
        }
        if (maxTriangle.isEmpty()) {
            maxTriangle.add(-1);
        }
        return maxTriangle;
        //ABOVE CODE WORKS FINE BUT IF YOU WANT TO HANDLE 'LONG' TYPE INTEGERS, THEN YOU NEED THE CODE BELOW
        // Convert the input List<Integer> to List<Long>
        // List<Long> sticksLong = new ArrayList<>();
        // for (Integer stick : sticks) {
        //     sticksLong.add((long) stick);
        // }

        // Collections.sort(sticksLong);
        // List<List<Long>> validTriangle = new ArrayList<>();
        // for (int i = 0; i < sticksLong.size() - 2; i++) {
        //     for (int j = i + 1; j < sticksLong.size() - 1; j++) {
        //         int k = j + 1;
        //         while (k < sticksLong.size() && sticksLong.get(i) + sticksLong.get(j) > sticksLong.get(k)) {
        //             validTriangle.add(List.of(sticksLong.get(i), sticksLong.get(j), sticksLong.get(k)));
        //             k++;
        //         }
        //     }
        // }
        // long max = 0;
        // List<Long> maxTriangle = new ArrayList<>();
        // for (List<Long> triangles : validTriangle) {
        //     long s = triangles.stream().mapToLong(Long::longValue).sum();
        //     if (max < s) {
        //         max = s;
        //         maxTriangle = triangles;
        //     }
        // }
        // if (maxTriangle.isEmpty()) {
        //     maxTriangle.add(-1L);
        // }
        // List<Integer> result = new ArrayList<>();
        // for (Long num : maxTriangle) {
        //     result.add(num.intValue());
        // }

        // return result;
    }

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>(List.of(3, 2, 1, 10, 5, 4));
        System.out.println(maximumPerimeterTriangle(ar));
    }
}
