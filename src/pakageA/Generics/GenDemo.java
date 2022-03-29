package pakageA.Generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(15);
        iOb.showTypeOfT();

        int v = iOb.getOb();
        System.out.println("value get from get method is: " + v);
    System.out.println("===========================");
        Gen<String> sOb = new Gen<>("NewWorld");
        sOb.showTypeOfT();

        String s = sOb.getOb();
        System.out.println("value get from get method is: " + s);

        // this will not compile, improve type safety. Take a look at NonGenDemo
        // iOb = sOb;
    }
}
