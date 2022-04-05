package pakageA.Lambda.ConstructorsRef;

public class Demo {

    public static <T, V> T getMethodFactory(MyFunc<T, V> func, V v) {
        return func.myMed(v);
    }

    public static void main(String[] args) {

        MyClass myClass = Demo.getMethodFactory(MyClass::new, 15);
        MyGenClass<String> myGenClass = Demo.getMethodFactory(MyGenClass::new, "muoi lam");

        System.out.println("my class: " + myClass.getVal());
        System.out.println("my gen class: " + myGenClass.getVal());

    }
}
