package pakageA.EnumDemo;

public class Demo {
    public static void main(String[] args) {

        Apple ap;

        for (Apple a : Apple.values()
             ) {
            System.out.println(a);
        }

        ap = Apple.valueOf("GoldenDel");
        System.out.println(Apple.Jonathan.compareTo(Apple.Cortland));

    }
}
