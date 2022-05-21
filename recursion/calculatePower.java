package recursion;

public class calculatePower {

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }

        int smallOutput = power(x, n-1);
        int output = x * smallOutput;
        return output;
    }

    public static void main(String[] args) {
        System.out.println(power(3,3));
    }
}
