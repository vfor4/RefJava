package pakageA.Lambda.DocsDemo;

import pakageA.Lambda.DocsDemo.Approach3.CheckPerson;
import pakageA.Lambda.DocsDemo.Approach4.Approach4;
import pakageA.Lambda.DocsDemo.Approach5.Approach5;
import pakageA.Lambda.DocsDemo.Approach6.Approach6;
import pakageA.Lambda.DocsDemo.Approach7.Approach7;
import pakageA.Lambda.DocsDemo.Approach8.Approach8;

import java.util.ArrayList;
import java.util.List;

public class RosterTest {
    public static void main(String[] args) {
        // approach4
        List<Person> lp = new ArrayList<>();
        lp.add(new Person("Nam", Sex.MALE, 22));
        lp.add(new Person("Nu", Sex.FEMALE, 20));
        lp.add(new Person("Trung", Sex.MALE, 26));
        Approach4.approach4(lp, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getGender() == Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25;
            }
        });

        // approach5

        Approach5.approach5(lp,
                person -> person.getGender() == Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25);

        // approach6
        Approach6.approach6(lp,
                person -> person.getGender() == Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25);

        // approach7
        Approach7.approach7(lp, (Person person) -> person.getGender() == Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25,
                p -> p.getName(),
                personName -> System.out.println(personName));

        // approach8
        Approach8.approach8(lp, (Person person) -> person.getGender() == Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25,
                p -> p.getName(),
                personName -> System.out.println(personName));

        // quick review ( approach9)
        lp.stream()
                .filter(p -> p.gender == Sex.MALE)
                .map(p -> p.getName())
                .forEach(name -> System.out.println(name));
    }
}
