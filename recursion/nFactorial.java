package recursion;

public class nFactorial{

    public static int fact (int n ){
        if (n==0){
            return 1;
        }

        int smallOutput = fact(n-1);
        int outPut = n * smallOutput;
        return outPut;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}