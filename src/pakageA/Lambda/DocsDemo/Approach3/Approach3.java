package pakageA.Lambda.DocsDemo.Approach3;

import pakageA.Lambda.DocsDemo.Person;

import java.util.List;

public class Approach3 {
    public static void printRoasted(List<Person> list, CheckPerson tester){
        for (Person p:
                list) {
            if(tester.test(p)){
                p.prinPerson();
            }
        }
    }
}
