package Streams.Range;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // a*a + b*b = c*c
//    List<double[]> pythagoreans =
//            IntStream.rangeClosed(1, 100)
//                    .boxed()
//                    .flatMap(a -> IntStream.rangeClosed(a, 100)
//                            .mapToObj(b-> new double[]{a,b, Math.sqrt(a*a + b*b)})
//                            .filter(b -> b[2] % 1.0 == 0)
//                    ).toList();
//    pythagoreans.stream().limit(5).forEach(a -> System.out.println(Arrays.toString(a)));
//        Stream.iterate(0, n-> n +2).limit(10).forEach(System.out::println);

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println();
    }



}
