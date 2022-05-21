package recursion;

public class sumOfArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        System.out.println(arrSum(arr,0));
    }

    private static int arrSum(int[] arr,int si) {
        if(arr.length == si){
            return 0;
        }

        int mySum = arrSum(arr, si + 1);
        mySum = mySum + arr[si];
        return mySum;
    }
}
