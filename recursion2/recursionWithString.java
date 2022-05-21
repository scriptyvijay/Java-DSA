package recursion2;

public class recursionWithString {

    public static String replaceXY(String s, char x, char y) {
        if (s.length() == 0) {
            return s;
        }

        String smallOutput = replaceXY(s.substring(1), x, y);
        if (s.charAt(0) == x) {
            return y + smallOutput;
        } else {
            return s.charAt(0) + smallOutput;
        }
    }

    public static void main(String[] args) {
        String s = "xyabcdyx";
        String c = replaceXY(s, 'x', 'y');
        System.out.println(c);
    }
}
