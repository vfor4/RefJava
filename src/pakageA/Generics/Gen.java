package pakageA.Generics;

public class Gen<T> {
    T ob;

    Gen(T ob){
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }

    void showTypeOfT(){
        System.out.println("Type of T is: " + ob.getClass().getName());
    }
}
