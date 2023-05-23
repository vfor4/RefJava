package ConstrucRef;

import fillter.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println(map(Arrays.asList(2,4), integer -> new Apple(integer)));
        System.out.println(map(Arrays.asList(1,3,5), Apple::new ));
    }

    public static List<Apple> map(List<Integer> weights, Function<Integer, Apple> f){
        List<Apple> apples = new ArrayList<>();
        for (Integer i: weights ) {
           apples.add(f.apply(i));
        }
        return apples;
    }
}
