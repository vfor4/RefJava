package Fundamentals.Methods;

public class Box<T> {
    private T t;
    public T get(){
        return this.t;
    }
    public void set(T t){
        this.t = t;
    }



    public  <T3 extends Number> void boxTest(Box<T3> n) { /* ... */ }

}
