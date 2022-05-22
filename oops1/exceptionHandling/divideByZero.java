package oops1.exceptionHandling;

public class divideByZero {
    public static void main(String[] args) throws exceptionThrow {
        try {
            divide(0, 10);
        } catch (exceptionThrow e) {
            System.out.println("Divide error");
        }

    }

    private static void divide(int a, int b) throws exceptionThrow {
        if (a / b == 0) {
            throw new exceptionThrow();
        }
    }
}
