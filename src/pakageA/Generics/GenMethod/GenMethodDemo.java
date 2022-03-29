package pakageA.Generics.GenMethod;

import pakageA.Generics.Gen;

public class GenMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T t, V[] vArrs){
        for (V v: vArrs
             ) {
            if(t.equals(v)){
                return  true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] iNums = {1,2,3,6,8,9};
        String[] sNums = {"one", "three", "eleven", "thirty nine"};
        System.out.println(GenMethodDemo.isIn(5, iNums) ? "in arr" : " is not in arr") ;
        System.out.println(GenMethodDemo.<String, String>isIn("hihi", sNums) ? "in arr" : "in not arr");
    }
}
