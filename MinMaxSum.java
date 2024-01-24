import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long tot = (long)arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3) + arr.get(4);
        System.out.println((tot - arr.get(4)) + " " + (tot - arr.get(0)));
    }
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<Integer>();
        arr.add(3);
        arr.add(7);
        arr.add(5);
        arr.add(9);
        arr.add(1);
        miniMaxSum(arr);
    }
}