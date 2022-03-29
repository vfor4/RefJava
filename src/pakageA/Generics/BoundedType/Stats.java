package pakageA.Generics.BoundedType;

public class Stats<T extends Number> {
    T[] arrs;

    Stats(T[] arrs){
        this.arrs = arrs;
    }

    double average(){
        double sum = 0.0;
        for (int i = 0; i < arrs.length; i++) {
            sum += arrs[i].doubleValue();
        }
        return sum/arrs.length;
    }
}
