package linkedList1.creation;

public class UseLinkedList {

    public static LinkedList<Integer> CreateLinkedList() {
        LinkedList<Integer> n1 = new LinkedList<Integer>(10);
        LinkedList<Integer> n2 = new LinkedList<Integer>(20);
        LinkedList<Integer> n3 = new LinkedList<Integer>(30);
        LinkedList<Integer> n4 = new LinkedList<Integer>(40);
        LinkedList<Integer> n5 = new LinkedList<Integer>(50);
        LinkedList<Integer> n6 = new LinkedList<Integer>(60);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        return n1;
    }

    public static void main(String[] args) {
        LinkedList<Integer> head = CreateLinkedList();

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }

}
