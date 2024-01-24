import java.util.HashSet;

public class Pangrams {
    public static String pangrams(String s) {
        HashSet<Character> alphabet = new HashSet<Character>();
        for (int i = 97; i < 122; i++) {
             alphabet.add((char)i);
        }
        s = s.toLowerCase();
        for (char ch : s.toCharArray()) {
            if (alphabet.contains(ch)) {
                alphabet.remove(ch);
            }
        }
        if (alphabet.isEmpty()) {
            return "pangram";
        }
        return "not pangram";
    }
    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
        System.out.println(pangrams("The quick brown fox jumps over the lazy dog"));
    }
}
