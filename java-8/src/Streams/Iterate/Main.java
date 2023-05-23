package Streams.Iterate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<Integer[]> fibos = ;
//                Stream.iterate(new Integer[]{0, 1}, n -> new Integer[]{n[1], n[0]+n[1]})
//                        .limit(20)
//                        .map(n-> n[0])
//                        .forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);


    }
}
