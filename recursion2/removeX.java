package recursion2;

import java.util.Scanner;

public class removeX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String c = removeChar(s, 'x');
        System.out.println(c);

    }

    public static String removeChar(String s, char x) {
        if (s.length() == 0) {
            return s;
        }

        String smallOutput = removeChar(s.substring(1), x);

        if (s.charAt(0) == x) {
            return "" + smallOutput;
        } else {
            return s.charAt(0) + smallOutput;
        }
    }
}
