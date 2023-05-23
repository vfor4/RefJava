package fillter;

public class Apple {

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Apple(int weight) {
        this.weight = weight;
}
    public int weight;

    public String color;

   public static boolean isGreen(Apple apple){
       return "green".equals(apple.color);
   }

    public static boolean isHeavyApple(Apple apple){
        return apple.weight > 150;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public boolean fool(Apple a){
       return true;
    }
    public static int compareByAge(Apple a, Apple b) {
        return a.color.compareTo(b.color);
    }
}
