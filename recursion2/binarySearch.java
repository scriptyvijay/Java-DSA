package recursion2;

public class binarySearch {

    public static int binarySearching(int arr[], int si, int ei, int x) {
        if (si > ei) {
            return -1;
        }

        int midIndex = (si + ei) / 2;
        if (arr[midIndex] == x) {
            return midIndex;
        } else if (arr[midIndex] < x) {
            return binarySearching(arr, midIndex + 1, ei, x);
        } else {
            return binarySearching(arr, si, midIndex - 1, x);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(binarySearching(arr, 0, arr.length - 1, 4));
    }
}
