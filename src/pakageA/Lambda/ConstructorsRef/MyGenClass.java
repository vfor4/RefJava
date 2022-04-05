package pakageA.Lambda.ConstructorsRef;

public class MyGenClass<T> {
    T val;

    MyGenClass(T val) {
        this.val = val;
    }

    MyGenClass() {
        this.val = null;
    }

    public T getVal() {
        return val;
    }
}
