public class CaesaeCipher {
    public static String caesarCipher(String s, int k) {
        if(k>26) k = k % 26;
        StringBuilder solution = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                char incLetter = (char) (ch + k);
                if (Character.isUpperCase(ch) && incLetter > 'Z' || Character.isLowerCase(ch) && incLetter > 'z') {
                    incLetter = (char) (incLetter - 26);
                }
                solution.append(incLetter);
            } else {
                solution.append(ch);
            }
        }
        return solution.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz", 2));
    }
}
