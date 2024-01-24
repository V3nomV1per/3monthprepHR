import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LonelyInteger {

    public static int lonelyInteger(List<Integer> arr) {
        Collections.sort(arr);
        Stack<Integer> st = new Stack<Integer>();
        for (int i : arr) {
            System.out.println(st);
            if (st.empty()) {
                st.add(i);
            } else if (st.peek() == i) {
                st.pop();
            } else {
                st.push(i);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println(lonelyInteger(arr));
    }
}
