package pakageA.Generics.GenericsInterface;

public class GenIFDemo{
    public static void main(String[] args) {
        Integer[] iArrs = {1,2,5,8,3};
        Character[] cArrs={'s','r', '1', 'h'};

        MyClass<Integer> iMC = new MyClass<>(iArrs);
        System.out.println("iMC's max value: " + iMC.max());
        System.out.println("iMC's min value: " + iMC.min());

        MyClass<Character> cMC = new MyClass<>(cArrs);
        System.out.println("cMC' max value: " + cMC.max());
        System.out.println("cMC' min value: " + cMC.min());
    }
}
