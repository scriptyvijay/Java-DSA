package oops3.genericClass;

public class genericClass {
    public static void main(String[] args) {
        

        UseGenericClass <Integer> ab = new UseGenericClass<Integer>(1, 2);
        ab.setFirst(12);
        ab.setSecond(10);
        System.out.println(ab.getFirst()+" "+ ab.getSecond());

    }
}
