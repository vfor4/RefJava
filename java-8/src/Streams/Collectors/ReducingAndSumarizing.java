package Streams.Collectors;
import Streams.Dish;

import java.util.*;

import static java.util.stream.Collectors.*;
import static Streams.Dish.menu;

public class ReducingAndSumarizing {
    public static void main(String[] args) {

           Optional<Dish> a = Dish.menu.stream().max(Comparator.comparing(Dish::getCalories));
           double a1 = Dish.menu.stream().mapToInt(Dish::getCalories).average().orElse(-1);
//        System.out.println(a1);
        IntSummaryStatistics a2 = Dish.menu.stream().mapToInt(Dish::getCalories).summaryStatistics();
//        System.out.println(a2.toString());
//        Dish.menu.stream().reduce((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2).get();
        int totalCalories = Dish.menu.stream().mapToInt(Dish::getCalories).sum();
//        System.out.println(totalCalories);

    }
}
