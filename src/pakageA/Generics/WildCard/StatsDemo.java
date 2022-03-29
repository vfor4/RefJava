package pakageA.Generics.WildCard;


public class StatsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1,2,3,4,5,8,9};
        Stats<Integer> iArrs = new  Stats<>(inums);

        Float[] fnums = {1f,2f,3f,4f,5f,8.0f,9.0f};
        Stats<Float> fArrs = new  Stats<>(fnums);
        System.out.println(iArrs.sameAverage(fArrs) ? "The same" : "Not equal");


            // can not run because String is not extends the Number interface
//        String[] snums = {"1","4", "8" };
//        Stats<String> sArrs = new Stats<String>(snums);

    }
}
