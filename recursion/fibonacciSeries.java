package recursion;

public class fibonacciSeries {

    public static int checkFib(int n){
        if(n==1 || n ==2){
            return 1;
        }

        int fib_1 = checkFib(n-1);
        int fib_2 = checkFib(n-2);
        int output = fib_1 + fib_2;
        return output;
    }

    public static void main(String[] args) {
      System.out.println(checkFib(5));  
    }
}
