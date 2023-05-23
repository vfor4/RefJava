package Fundamentals.Methods;

public class Utils {
    public static <V, K> boolean compareObj(Pair<K, V> a, Pair<K, V> b){
        return a.getKey().equals(b.getKey()) && a.getValue().equals(b.getValue());
    }
}
