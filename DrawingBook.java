public class DrawingBook {
    public static int pageCount(int n, int p) {
        return p / 2 < n / 2 - p / 2 ? p / 2 : n / 2 - p / 2;
    }

    public static void main(String[] args) {
        System.out.println(pageCount(100, 5));
        System.out.println(pageCount(100, 100));
        System.out.println(pageCount(100, 1));
        System.out.println(pageCount(100, 67));
        System.out.println(pageCount(100, 5));
    }
}
