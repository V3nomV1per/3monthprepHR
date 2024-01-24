import java.util.List;
import java.util.ArrayList;

public class FlippingTheMatrix {
    public static int flippingMatrix (List<List<Integer>> matrix) {
        int sum = 0;
        int n = matrix.size()/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int maxVal = Math.min(matrix.get(i).get(j), Math.max(matrix.get(i).get(2*n-1-j), Math.max(matrix.get(2*n-1-i).get(j), matrix.get(2*n-1-i).get(2*n-1-j))));
                sum += maxVal;
            }
        }
        return sum;
    }
    

    public static void main(String[] args) {
        // Create a 4x4 matrix (List of Lists)
        List<List<Integer>> matrix = new ArrayList<>();

        // Assign values to the matrix
        for (int i = 0; i < 4; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                // Assigning some values, you can modify this part as needed
                int value = i * 4 + j + 1;
                row.add(value);
            }
            matrix.add(row);
        }

        // Print the matrix
        for (List<Integer> row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println("After the operation, sum = "+ flippingMatrix(matrix));
    }
}