package Streams;

import fillter.Apple;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Dish> dishs = Dish.menu.stream().filter(Dish::isVegetarian).toList();

        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
        List<Integer> integers = words.stream().map(String::length).toList();
//        System.out.println(integers);
        // Flat
        String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> streamOfwords = Arrays.stream(arrayOfWords);
        List<String> flat = streamOfwords
                .map(a -> a.split(""))
                .flatMap(Arrays::stream)
//                .map(Arrays::stream)
                .distinct()
                .toList();
//        System.out.println(flat);
        // Quiz 5.2 Mapping 1)
        List<Integer> integers1 = Arrays.asList(1,2,3,4,5);
        List<Integer> resultIs1 = integers1.stream().map(n -> n * n).toList();
//        System.out.println(resultIs1);
        // Quiz 5.2 Mapping 2)
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(3,4);
        Integer[] integers2 = new Integer[]{1,3,4,5,6,7,8,89};
        ArrayList<Apple> cars = new ArrayList<>(100);

        List<Integer[]> result = list1.stream().flatMap(i -> list2.stream().map(j -> new Integer[]{i, j})).toList();
//        result.forEach( l -> System.out.println(Arrays.toString(l)));
        List<Integer[]> result2 = list1.stream()
                .flatMap(
                        i -> list2.stream()
                                .filter(j -> (j*i) % 2 != 0)
                                .map(j -> new Integer[]{i, j}))
                .toList();

//        result2.forEach( l -> System.out.println(Arrays.toString(l)));
        // Quiz 5.3 Reducing
        long count = Dish.menu.stream().map(d -> 1).reduce(0, Integer::sum);
        System.out.println(count);

    }
}
