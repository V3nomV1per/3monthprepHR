import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    
    public static int diagonalDifference(List<List<Integer>> arr) {
        int rightDiag = 0;
        int leftDiag = 0;
        for (int i = 0; i < arr.size(); i++) {
            leftDiag = arr.get(i).get(i) + leftDiag;
            rightDiag = arr.get(i).get(arr.size()-1-i) + rightDiag;
        }
        return Math.abs(leftDiag-rightDiag);
    }
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        
        arr.add(List.of(1, 2, 3));
        arr.add(List.of(4, 5, 6));
        arr.add(List.of(9, 8, 9));
        System.out.println(diagonalDifference(arr));
    }
}
