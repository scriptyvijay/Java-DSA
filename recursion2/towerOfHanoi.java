package recursion2;

public class towerOfHanoi {

    public static void towerHanoi(int n, char s, char h, char d) {
        if (n == 1) {
            System.out.println("Move 1st Disk from " + s + " to " + d);
            return;
        }

        towerHanoi(n - 1, s, d, h);
        System.out.println("Move " + n + "th disk from " + s + " to " + d);
        towerHanoi(n - 1, h, s, d);
    }

    public static void main(String[] args) {
        towerHanoi(3, 's', 'h', 'd');
    }
}
