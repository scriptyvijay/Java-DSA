package recursion2;

public class quickSort {

    public static void quickSorting(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pivotIndex = partition(arr, si, ei);
        quickSorting(arr, si, pivotIndex - 1);
        quickSorting(arr, pivotIndex + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {

        int pivotElement = arr[si];
        int smallNumCount = 0;

        for (int i = si + 1; i <= ei; i++) {
            if (arr[i] < pivotElement) {
                smallNumCount++;
            }
        }
        int temp = arr[si + smallNumCount];
        arr[si + smallNumCount] = pivotElement;
        arr[si] = temp;

        int i = si;
        int j = ei;
        while (i < j) {
            if (arr[i] < pivotElement) {
                i++;
            } else if (arr[j] >= pivotElement) {
                j--;
            } else {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return si + smallNumCount;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        quickSorting(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
