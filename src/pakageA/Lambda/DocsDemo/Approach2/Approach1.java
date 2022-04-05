package pakageA.Lambda.DocsDemo.Approach2;

import pakageA.Lambda.DocsDemo.Person;

import java.util.List;

public class Approach1 {
    public static void printPersonOlderThan(List<Person> list, int low, int high) {
        for (Person p :
                list) {
            if (low <= p.getAge() && high > p.getAge()) {
                p.prinPerson();
            }
        }
    }
}
