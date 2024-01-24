public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int valleys = 0, elevation = 0, check = 0;
        for (char ch : path.toCharArray()) {
            if (ch=='D') {
                elevation--; 
            } else {
                elevation++;
            }
            if (elevation < 0 && check == 0) {
                valleys++;
                check = 1;
            } else if (elevation == 0 && check == 1) {
                check = 0;
            }
        }
        return valleys;
    }
    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
        System.out.println(countingValleys(8, "DDUUUUDD"));
    }
}
