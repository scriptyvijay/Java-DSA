package linkedList1.node;

import java.util.Scanner;

public class NodeUse {
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        insertR(head, 40, 2);
        printR(head);
        deleteR(head, 2);
        printR(head);

    }

    public static void printR(Node<Integer> head) {
        if (head == null) {
            System.out.println();
            return;

        }

        System.out.print(head.data + " ");
        printR(head.next);

    }

    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                head = currentNode;
            } else {
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = sc.nextInt();
        }
        sc.close();
        return head;
    }

    public static Node<Integer> insertR(Node<Integer> head, int elem, int pos) {
        if (head == null && pos > 0) {
            return head;
        }

        if (pos == 0) {
            Node<Integer> newNode = new Node<Integer>(elem);
            newNode.next = head;
            return newNode;
        } else {
            head.next = insertR(head.next, elem, pos - 1);
            return head;
        }
    }

    public static Node<Integer> deleteR(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }

        if (pos == 0) {
            head = head.next;
            return head;
        } else {
            head.next = deleteR(head.next, pos - 1);
            return head;
        }
    }

    public static Node<Integer> reverseR(Node<Integer> head) {

        return head;
    }
}
