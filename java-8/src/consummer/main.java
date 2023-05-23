package consummer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {
        // abstract method named accept that takes an object of generic type T and returns no result ( void)

        List<Person> personList = Arrays.asList(
                new Person("person1"),
                new Person("person2"),
                new Person("person3"),
                new Person("person4")
        );
        addFruitTo(personList, person -> person.getFruits().add("banana"));
        System.out.println(personList.toString());
    }

    public static void addFruitTo(List<Person> personList, Consumer<Person> consumer){
        for (Person p: personList ) {
           consumer.accept(p);
        }
    }
}
