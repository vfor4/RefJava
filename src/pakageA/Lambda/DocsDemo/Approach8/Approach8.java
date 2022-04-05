package pakageA.Lambda.DocsDemo.Approach8;

import pakageA.Lambda.DocsDemo.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Approach8 {
    public static <T, E> void approach8(Iterable<T> personList,
                                        Predicate<T> tPredicate,
                                        Function<T, E> teFunction,
                                        Consumer<E> eConsumer) {

        for (T t: personList
             ) {
            if(tPredicate.test(t)){
                E e = teFunction.apply(t);
                eConsumer.accept(e);
            }
        }
    }
}
