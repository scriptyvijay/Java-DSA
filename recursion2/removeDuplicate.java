package recursion2;

public class removeDuplicate {

    public static String removeChar(String s) {
        if (s.length() == 1) {
            return s;
        }

        String smallOutput = removeChar(s.substring(1));

        if (s.charAt(0) == s.charAt(1)) {
            return smallOutput;
        } else {
            return s.charAt(0) + smallOutput;
        }
    }

    public static void main(String[] args) {
        System.out.println(removeChar("aabbcddeeff"));
    }
}
