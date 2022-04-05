package pakageA.Lambda.DocsDemo.Approach6;

import pakageA.Lambda.DocsDemo.Person;

import java.util.List;
import java.util.function.Predicate;

public class Approach6 {
    public static void approach6(List<Person> personList, Predicate<Person> predicate){
        for (Person p: personList
             ) {
            if(predicate.test(p)){
                p.prinPerson();
            }
        }
    }
}
