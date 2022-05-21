package recursion;

public class checkArrayIsSort1 {

    public static boolean isSorted(int[] arr) {

        if(arr.length ==1){
            return true;
        }

        if(arr[0]>arr[1]){
            return false;
        }

        int smallArray [] = new int[arr.length-1];
        for(int i = 1; i<arr.length;i++){
            smallArray[i-1]=arr[i];
        }

        boolean isSort = isSorted(smallArray);
        return isSort;

    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(isSorted(arr));
    }

    
}
