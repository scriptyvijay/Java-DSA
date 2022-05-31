package stack;

public class Stack {
    private int data[];
    private int topIndex;

    public Stack() {
        data = new int[10];
    }

    public void push(int elem) throws StackFullException {
        if (topIndex == data.length - 1) {
            // Throw an Exception
            doubleCapacity();
        }
        data[++topIndex] = elem;

    }

    private void doubleCapacity() {
        System.out.println("Double");
        int temp[] = data;
        data = new int[2 * data.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = data[i];
        }

    }

    public int top() throws StackEmptyException {
        if (topIndex == -1) {
            // throw exception
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    public int pop() throws StackEmptyException {
        if (topIndex == -1) {
            // throw exception
            throw new StackEmptyException();
        }
        int temp = data[topIndex--];
        return temp;
    }

    public int size() {
        return topIndex + 1;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }
}
