package fillter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    private static String RED_COLOR = "red";
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(
                Arrays.asList(new Apple(120, "red"),
                        new Apple(160, "pink"),
                        new Apple(160, "red"),
                        new Apple(130, "green"))
        );

        System.out.println(fillterApple(apples, Apple::isHeavyApple));

        apples.sort(Apple::compareByAge);

        System.out.println(fillterApple(apples, Apple::isGreen).get(0).toString());

//        Runnable runnable = ()-> System.out.println("runnable 1");
//        processs(runnable);
//        processs(()-> System.out.println("runnable 2"));



    }
    public static void processs(Runnable runnable){
        runnable.run();
    }

    public static List<Apple> fillterApple(List<Apple> appleList, Predicate<Apple> p ){
        List<Apple> result = new ArrayList<>();
//        result.sort(Comparator.comparing(Apple::isGreen));
//        result.sort((a1, a2) -> a1.color.compareTo(a2.color));
        for (Apple apple : appleList){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
