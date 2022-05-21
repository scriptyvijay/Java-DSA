package recursion;

public class lastElementInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(fi(arr, 8));
        System.out.println(fi2(arr, 8, 0));
    }

    public static int fi(int arr[], int x) {
        // 1st Method

        if (arr.length == 0) {
            return -1;
        }

        if (arr[0] == x) {
            return 0;
        }

        int smallArray[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallArray[i - 1] = arr[i];
        }

        int fIndex = fi(smallArray, x);
        int index = fIndex + 1;
        return index;
    }

    // Second Better Method

    public static int fi2(int arr[], int x, int si) {
        if (arr.length == si) {
            return -1;
        }

        if (arr[si] == x) {
            return si;
        }

        int fIndex = fi2(arr, x, si + 1);
        return fIndex;
    }

}
