package pakageA.Generics.BoundedType;

public class StatsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1,2,3,4,5,8,9};
        Stats<Integer> iArrs = new Stats<>(inums);
        System.out.println("Average integer type is : " + iArrs.average());

        Float[] fnums = {1f,2f,3f,4f,5f,8.8f,9.5f};
        Stats<Float> fArrs = new Stats<>(fnums);
        System.out.println("Average float type is : " + fArrs.average());

            // can not run because String is not extends the Number interface
//        String[] snums = {"1","4", "8" };
//        Stats<String> sArrs = new Stats<String>(snums);

    }
}
