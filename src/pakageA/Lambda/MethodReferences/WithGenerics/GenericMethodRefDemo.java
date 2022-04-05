package pakageA.Lambda.MethodReferences.WithGenerics;

import java.util.Comparator;

public class GenericMethodRefDemo {
    static <T> int myOps(MyFunc<T> func, T[] vals, T v ){
        return  func.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] integers = {1,3,2,4,3,2,3,56,65,4,3};

        System.out.println(GenericMethodRefDemo.myOps(MyArraysOps::<Integer>countMatching, integers, 3));
    }
}
