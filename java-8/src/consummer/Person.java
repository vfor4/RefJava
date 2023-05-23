package consummer;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String name;

    public List<String> fruits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fruits=" + fruits +
                '}';
    }

    public Person(String name) {
        this.name = name;
        this.fruits = new ArrayList<>();
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }
}
