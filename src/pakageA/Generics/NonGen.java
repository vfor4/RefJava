package pakageA.Generics;

public class NonGen {
    Object ob;

    NonGen(Object ob){
        this.ob = ob;
    }

    Object getOb(){
        return ob;
    }

    void showTypeOfT(){
        System.out.println("Type of T is: " + ob.getClass().getName());
    }
}
