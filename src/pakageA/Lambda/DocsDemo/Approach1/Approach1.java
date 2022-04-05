package pakageA.Lambda.DocsDemo.Approach1;

import pakageA.Lambda.DocsDemo.Person;

import java.util.List;

public class Approach1 {
    public static void printPersonOlderThan(List<Person> list, int age){
        for (Person p:
             list) {
            if(p.getAge() > age){
                p.prinPerson();
            }
        }
    }
}
