package oops3.pair;

public class PairUse {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<Integer, String>(10, "abc");
        Pair<Pair<Integer, String>, String> pOut = new Pair<>(p, "Hello");
        pOut.setFirst(p);
        p.setFirst(12);
        System.out.println(p.getFirst());
        System.out.println(p.getFirst());
    }
}
