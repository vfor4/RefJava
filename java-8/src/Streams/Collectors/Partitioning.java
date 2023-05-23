package Streams.Collectors;
import Streams.Dish;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

import  static Streams.Dish.menu;


public class Partitioning {
    public static void main(String[] args) {
       Map<Boolean, List<Dish>> a = menu.stream().collect(partitioningBy(Dish::isVegetarian));
        System.out.println(a);

    }
}
