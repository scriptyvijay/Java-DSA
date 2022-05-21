package recursion;

public class numOfDigit {

    public static int checkDigit(int n){
        if(n/10==0){
            return 1;
        }

        int smallOutput = checkDigit(n/10);
        int output = smallOutput + 1;
        return output;
    }

    public static void main(String[] args) {
        System.out.println(checkDigit(1234));
    }
}
