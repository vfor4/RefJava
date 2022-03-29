package pakageA.Generics;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb = new NonGen(15);
        iOb.showTypeOfT();

        int v = (Integer) iOb.getOb();
        System.out.println("value get from get method is: "+v);
        System.out.println("===========================");
        NonGen sOb = new NonGen("NewWorld");
        sOb.showTypeOfT();

        String s = (String) sOb.getOb();
        System.out.println("value get from get method is: "+s);

        // this compiles, improve type safety
         iOb = sOb; // this not safe anymore, if we extract value, we will get run-time error
    }

}
