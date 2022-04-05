package pakageA.Lambda;

public class LambdaDemo {

    Integer i;

    public double lambdaModifyInstanceVariable(){
        MyNum mNum = () ->{
          i = 5;
          return i;
        };
        return mNum.getVal();
    }

    public static void main(String[] args) {

        MyNum myNum;
        LambdaDemo lambdaDemo = new LambdaDemo();
        Integer a = 5;
        myNum = () -> {
            int v = a + 5;

            return v;
        };

        System.out.println(myNum.getVal());
        System.out.println(lambdaDemo.lambdaModifyInstanceVariable());
    }
}
