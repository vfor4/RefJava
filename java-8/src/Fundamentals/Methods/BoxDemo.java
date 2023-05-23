package Fundamentals.Methods;

import java.util.List;

public class BoxDemo {
    public static <U> void addBox(U u, List<Box<U>> boxes){
        Box<U> box = new Box<>();
        box.set(u);
        boxes.add(box);
    }
    public static <U> void outOfBoxes(List<Box<U>> boxes){
        int counter = 0;
        for (Box<U> uBox : boxes) {
            U boxContents = uBox.get();
            System.out.println("Box #" + counter++ + " contains [" +
                    boxContents.toString() + "]");
        }
    }

    // dùng wildcard khai báo để có thể dùng các type khác
    void processStringList(List<String> stringList) {
        // process stringList
    }
    // dùng wildcard
//    void processStringWithWildcard(List<Number> numbers){
    void processStringWithWildcard(List<? extends Number> numbers){

    }

    public static void printElement(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
    void foo(List<?> i) {
        fooHelper(i);
    }
    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }
    void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
        Number temp = l1.get(0);
//        l1.set(0, l2.get(0)); // expected a CAP#1 extends Number,
        // got a CAP#2 extends Number;
        // same bound, but different types
//        l2.set(0, temp);	    // expected a CAP#1 extends Number,
        // got a Number
    }
}
