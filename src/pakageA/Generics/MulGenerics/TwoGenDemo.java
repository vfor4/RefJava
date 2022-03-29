package pakageA.Generics.MulGenerics;

public class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> tg = new TwoGen<>(9999, "lucky number");

        tg.showType();

        System.out.println("value's obj1: "+tg.getOb1());
        System.out.println("value's obj2: "+tg.getOb2());
    }
}
