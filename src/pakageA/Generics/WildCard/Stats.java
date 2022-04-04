package pakageA.Generics.WildCard;

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

    // using wildcard here
    boolean sameAverage(Stats<?> ob){
        if(average() == ob.average()){
            return  true;
        }
        return false;
    }
}
