package pakageA.Generics.GenericsInterface;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] tArrs;

    MyClass(T[] tArrs) {
        this.tArrs = tArrs;
    }


    @Override
    public T min() {
        T mi = tArrs[0];
        for (T t :
                tArrs) {
            if (t.compareTo(mi) < 0) mi = t;
        }
        return mi;
    }

    @Override
    public T max() {
        T mx = tArrs[0];
        for (T t :
                tArrs) {
            if (t.compareTo(mx) > 0) mx = t;
        }
        return mx;
    }
}
