package recursion2;

public class replacePI {

    public static String replaceChar(String s) {
        if (s.length() == 0) {
            return s;
        }

        // for 2 char
        if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {
            // call for 2
            String smallOutput = replaceChar(s.substring(2));
            return 3.14 + smallOutput;

        } else {
            // call for 1
            String smallOutput = replaceChar(s.substring(1));
            return s.charAt(0) + smallOutput;
        }
    }

    public static void main(String[] args) {
        System.out.println(replaceChar("abcpicdpicpi"));
    }
}
