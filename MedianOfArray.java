import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfArray {
    public static int medianFinder(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size()/2);
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(7);
        arr.add(3);
        arr.add(9);
        arr.add(2);
        System.out.println(medianFinder(arr));
    }    
}