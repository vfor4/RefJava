package pakageA.Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNum myNum;

        myNum = () -> 123.456;

        System.out.println(myNum.getVal());
    }
}
