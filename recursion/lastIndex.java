package recursion;

public class lastIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(findLast(arr, 6));
        System.out.println(findLast2(arr, 6, 0));
    }

    public static int findLast(int arr[], int x) {
        if (arr.length == 0) {
            return -1;
        }

        int smallArray[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallArray[i - 1] = arr[i];
        }
        int k = findLast(smallArray, x);
        if (k != -1) {
            return k + 1;
        } else {
            if (arr[0] == x) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    // Better way

    public static int findLast2(int arr[], int x, int si) {
        if (arr.length == si) {
            return -1;
        }

        int k = findLast2(arr, x, si + 1);
        if (k != -1) {
            return k;
        } else {
            if (arr[si] == x) {
                return si;
            } else {
                return -1;
            }
        }
    }
}
