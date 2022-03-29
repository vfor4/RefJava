package pakageA.Generics.MulGenerics;

public class TwoGen <T,E>{

    T t;
    E e;

    TwoGen(T t, E e){
        this.t = t;
        this.e = e;
    }

    T getOb1(){
        return t;
    }

    E getOb2(){
        return e;
    }

    void showType(){
        System.out.println("Type of obj 1 is: " + t.getClass().getName());
        System.out.println("Type of obj 2 is: " + e.getClass().getName());
    }
}
