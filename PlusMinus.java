import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<Integer>();
        arr.add(-1);
        arr.add(1);
        arr.add(-1);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        plusMinus(arr);
    }
    public static void plusMinus(List<Integer> arr) {
        int p = 0, n = 0, z = 0;
        for (int i : arr) {
            p = i>0?p+1:p+0;
            n = i<0?n+1:n+0;
            z = i==0?z+1:z+0;
        }
        System.out.println((float)p/arr.size());
        System.out.println((float)n/arr.size());
        System.out.println((float)z/arr.size());
    }
}