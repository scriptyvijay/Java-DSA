package oops1.student;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.name = sc.nextLine();
        s1.rollNumber = sc.nextInt();
        sc.close();

        System.out.println(s1.rollNumber + " " + s1.name);
    }
}
