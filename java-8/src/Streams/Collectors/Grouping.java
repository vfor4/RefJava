package Streams.Collectors;

import Streams.Dish;

import java.util.*;

import static Streams.Dish.menu;
import static java.util.stream.Collectors.*;

public class Grouping {
    enum CaloLevel {DIET, NORMAL, FAT}

    ;

    public static void main(String[] args) {

        Map<Dish.Type, List<Dish>> a = menu.stream().collect(groupingBy(Dish::getType));
//        a.forEach( (k,v) -> System.out.println(k + " " + v));

        // custom groupBy Condition
        Map<CaloLevel, List<Dish>> a1 = menu.stream().collect(
                groupingBy(
                        dish -> {
                            if (dish.getCalories() < 500) return CaloLevel.DIET;
                            else if (dish.getCalories() > 500 && dish.getCalories() < 700) return CaloLevel.NORMAL;
                            return CaloLevel.FAT;
                        }
                )
        );
        // a1.forEach((k,v) -> System.out.println(k + "" +v));

        // Collect data in subgroup {OTHER=4, MEAT=3, FISH=2}
        Map<Dish.Type, Long> a2 = menu.stream().collect(groupingBy(Dish::getType, counting()));
        // System.out.println(a2);

        // {OTHER=Optional[pizza], MEAT=Optional[pork], FISH=Optional[salmon]}
        Map<Dish.Type, Optional<Dish>> a3 = menu.stream().collect(groupingBy(Dish::getType, maxBy(Comparator.comparingInt(Dish::getCalories))));
        System.out.println(a3);

//        {OTHER=pizza, MEAT=pork, FISH=salmon}
        Map<Dish.Type, Dish> a4 = menu.stream().collect(groupingBy(Dish::getType, collectingAndThen(
                maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get
        )));
        System.out.println(a4);

//      {OTHER=[NORMAL, DIET], MEAT=[NORMAL, FAT, DIET], FISH=[NORMAL, DIET]}
        Map<Dish.Type, Set<CaloLevel>> caloricLevelsByType = menu.stream().collect(groupingBy(Dish::getType, mapping(dish -> {
            if (dish.getCalories() <= 400) return CaloLevel.DIET;
            else if (dish.getCalories() <= 700) return CaloLevel.NORMAL;
            else return CaloLevel.FAT;
        }, toSet())));
        System.out.println(caloricLevelsByType);
    }
}
