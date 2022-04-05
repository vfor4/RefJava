package pakageA.Lambda.DocsDemo.Approach3;

import pakageA.Lambda.DocsDemo.Person;
import pakageA.Lambda.DocsDemo.Sex;

public class CheckPersonEligibleForSelectiveService implements CheckPerson{

    @Override
    public boolean test(Person p) {
        return p.getGender() == Sex.MALE &&
                p.getAge() >= 18 &&
                p.getAge() <= 25;
    }
}
