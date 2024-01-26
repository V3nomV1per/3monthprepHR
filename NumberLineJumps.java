public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if ((x2 < x1 && v2 < v1) || (x2 > x1 && v2 > v1)) {
            return "NO";
        }
        int minKang = Math.min(x2, x1);
        int maxKang = Math.max(x1, x2);
        while (minKang<=maxKang) {
            if (minKang == maxKang) {
                return "YES";
            }
            minKang+=Math.max(v1, v2);
            maxKang+=Math.min(v1, v2);
        }
        return "NO";
    }
    public static void main(String[] args) {
        System.out.println(kangaroo(7, 2, 9, 2));
        System.out.println(kangaroo(2, 1, 1, 2));
    }
}
