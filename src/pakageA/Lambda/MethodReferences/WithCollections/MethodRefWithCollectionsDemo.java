package pakageA.Lambda.MethodReferences.WithCollections;

import java.util.ArrayList;
import java.util.Collections;

public class MethodRefWithCollectionsDemo {
    static int findMaxValue(MyClass m1, MyClass m2) {
        return m1.getVal() - m2.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> myClassArrayList = new ArrayList<>();
        myClassArrayList.add(new MyClass(5));
        myClassArrayList.add(new MyClass(51));
        myClassArrayList.add(new MyClass(52));
        myClassArrayList.add(new MyClass(533));
        myClassArrayList.add(new MyClass(54));
        myClassArrayList.add(new MyClass(59));
        MyClass maxValObj = Collections.max(myClassArrayList, MethodRefWithCollectionsDemo::findMaxValue);
        System.out.println(maxValObj.getVal());
    }
}
