package pakageA.Generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(15);
        iOb.showTypeOfT();

        int v = iOb.getOb();
        System.out.println("value get from get method is: " + v);
        System.out.println("===========================");
        var sOb = new Gen<>("NewWorld");
        Gen<?>[] ss = new Gen<?>[10];

        sOb.showTypeOfT();

        String s = sOb.getOb();
        System.out.println("value get from get method is: " + s);

        // this will not compile, improve type safety. Take a look at NonGenDemo
        // iOb = sOb;

        Gen rawType = new Gen(Double.valueOf(56));
        double dRawType = (double) rawType.getOb();
        System.out.println("dRawType: " + dRawType);
    }
}
