package stack_LinkedList;

public class StackUsingLL<T> {
    private Node<T> head;
    private int size;

    public StackUsingLL() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T elem) {
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T top() {
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    public T pop() {
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}
