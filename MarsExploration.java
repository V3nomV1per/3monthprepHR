public class MarsExploration {
    public static int marsExploration(String s) {
        int count = 0;
        for (int i = 0; i < s.length()-2; i+=3) {
            if (s.charAt(i) != 'S') {
                count++;
            }
            if (s.charAt(i+1) != 'O') {
                count++;
            }
            if (s.charAt(i+2) != 'S') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(marsExploration("SOSTOTSOT"));    //3
        System.out.println(marsExploration("SOSSPSSQSSOR")); //3
        System.out.println(marsExploration("SOSTOT"));       //2
    }
}
