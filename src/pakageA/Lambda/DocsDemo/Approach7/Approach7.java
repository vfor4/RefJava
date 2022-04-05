package pakageA.Lambda.DocsDemo.Approach7;

import pakageA.Lambda.DocsDemo.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Approach7 {
    public static void approach7(List<Person> personList,
                                 Predicate<Person> personPredicate,
                                 Function<Person, String> name,
                                 Consumer<String> personConsumer){
        for (Person p : personList
             ) {
            if(personPredicate.test(p)){
                String personName = name.apply(p);
                personConsumer.accept(personName);
            }
        }
    }
}
