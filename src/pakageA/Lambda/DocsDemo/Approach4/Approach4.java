package pakageA.Lambda.DocsDemo.Approach4;

import pakageA.Lambda.DocsDemo.Approach3.CheckPerson;
import pakageA.Lambda.DocsDemo.Person;

import java.util.List;

public class Approach4 {
    public static void approach4(List<Person> lp, CheckPerson cp) {
        for (Person p : lp
        ) {
            if(cp.test(p)){
                p.prinPerson();
            }
        }
    }
}
