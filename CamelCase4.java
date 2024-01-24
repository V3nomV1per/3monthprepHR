import java.util.Scanner;

public class CamelCase4 {
    public static void splitMethodOrVariable(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                result.append(" ");
                result.append(Character.toLowerCase(input.charAt(i)));
                continue;
            }
            if (input.charAt(i) == '(')
                break;
            result.append(input.charAt(i));
        }
        System.out.println(result.toString());
    }

    public static void splitClass(String input) {
        StringBuilder result = new StringBuilder();
        result.append(Character.toLowerCase(input.charAt(0)));
        for (int i = 1; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                result.append(" ");
                result.append(Character.toLowerCase(input.charAt(i)));
                continue;
            }
            result.append(input.charAt(i));
        }
        System.out.println(result.toString());
    }

    public static void combineMethodOrVariable(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                i++;
                result.append(Character.toUpperCase(input.charAt(i)));
                continue;
            }
            result.append(input.charAt(i));
        }
        if (input.charAt(0) == 'M') {
            result.append("()");
        }
        System.out.println(result.toString());
    }

    public static void combineClass(String input) {
        StringBuilder result = new StringBuilder();
        result.append(Character.toUpperCase(input.charAt(0)));
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                i++;
                result.append(Character.toUpperCase(input.charAt(i)));
                continue;
            }
            result.append(input.charAt(i));
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            switch (input.charAt(0)) {
                case 'S':
                    switch (input.charAt(2)) {
                        case 'M':
                        case 'V':
                            splitMethodOrVariable(input.substring(4));
                            break;

                        case 'C':
                            splitClass(input.substring(4));
                            break;
                    }
                    break;
                case 'C':
                    switch (input.charAt(2)) {
                        case 'M':
                        case 'V':
                            combineMethodOrVariable(input.substring(2));
                            break;

                        case 'C':
                            combineClass(input.substring(4));
                            break;
                    }
                    break;
            }
        }
        sc.close();
    }
}