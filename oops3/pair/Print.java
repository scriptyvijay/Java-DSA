package oops3.pair;

public class Print {
    public static <T> void printArray(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[5];

        Vehicle c = new Vehicle();
        c.a = "Hello";
        c.b = 10;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 001;
        }

        printArray(arr);
        Vehicle v[] = new Vehicle[5];
        for (int i = 0; i < arr.length; i++) {
            v[i] = new Vehicle();
        }
        printArray(v);
    }

}
