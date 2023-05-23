package ConstrucRef;

import fillter.Apple;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class UsingMapWithReference {
    public static void main(String[] args) {
        Map<Integer, Function<Integer, Apple>> functionMap = new HashMap<>();

        functionMap.put(1, Apple::new);
        functionMap.put(2, Apple::new);
        functionMap.put(3, Apple::new);
        functionMap.put(4, Apple::new);

        functionMap.get(1).apply(2);
    }
}
