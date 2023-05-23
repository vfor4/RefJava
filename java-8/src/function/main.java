package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class main {
    public static void main(String[] args) {
        System.out.println(map(Arrays.asList("anh", "la", "ai", "the"), String::length).toString());
    }

    public static <R, T> List<R> map(List<T> tList, Function<T, R> f){
      List<R> rList = new ArrayList<>();
        for (T t: tList) {
          rList.add(f.apply(t));
        }
      return rList;
    }
}
