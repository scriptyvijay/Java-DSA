package stack;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        Stack a = new Stack();
        for (int i = 0; i <= 100; i++) {
            a.push(i);
            System.out.println(a.top());
        }
    }
}
