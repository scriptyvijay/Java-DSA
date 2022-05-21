package recursion;

public class checkArrayIsSort2 {
    public static void main(String[] args) {
        int arr [] = { 1,2,3,4,5,6,7,8};
        System.out.println(isSorted(arr,0));
    }

    public static boolean isSorted(int[] arr, int si) {
        if(arr.length - 1 ==si){
            return true;
        }

        if(arr[si]>arr[si+1]){
            return false;
        }

        boolean isSmallArraySorted = isSorted(arr, si+1);
        return isSmallArraySorted;

    }
}
