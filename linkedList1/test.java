package linkedList1;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(30);
        arr.add(40);

        System.out.println(arr.get(1));

        ArrayList<Integer> te1 = new ArrayList<>();

        te1.add(1);
        te1.add(2);
        te1.add(3);
        te1.add(4);
        te1.add(5);
        te1.add(6);
        te1.add(7);
        te1.set(0, 0);
        te1.add(1, 1);

        for (int i : te1) {
            System.out.println(i);
        }
    }
}
