public class FlippingBits {

    public static long flippingBits(long n) {
        // long result = 0;
        // StringBuilder complement = new StringBuilder();
        // while (n != 0) {
        //     complement.append(n % 2 == 0 ? 1 : 0);
        //     n /= 2;
        // }
        // int length = complement.length();
        // if (length != 32) {
        //     length = 32 - length;
        //     while (length != 0) {
        //         complement.append(1);
        //         length--;
        //     }
        // }
        // length = 31;
        // complement.reverse();
        // for (char ch : complement.toString().toCharArray()) {
        //     result = (long)(result + (int) Math.pow(2, length--) * (ch - '0'));
        // }
        // return result+1;
        long result = 0;
        StringBuilder complement = new StringBuilder();
        
        for (int i = 0; i < 32; i++) {
            complement.append((n % 2 == 0) ? 1 : 0);
            n /= 2;
        }
        
        complement.reverse();
        
        for (char ch : complement.toString().toCharArray()) {
            result = (result << 1) | (ch - '0');
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(flippingBits(0));             // Expected: 4294967295L
        System.out.println(flippingBits(87654321));       // Expected: Different from input
    }
}
