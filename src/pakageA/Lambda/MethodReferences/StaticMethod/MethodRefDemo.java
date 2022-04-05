package pakageA.Lambda.MethodReferences.StaticMethod;

public class MethodRefDemo {
    static String revDemo(StringFunc stringFunc, String inStr){
        return stringFunc.func(inStr);
    }
    public static void main(String[] args) {
        String inStr = "vietnamese gang";
        String outStr = "";
        MyStringOps myStringOps = new MyStringOps();
        System.out.println(MethodRefDemo.revDemo(MyStringOps::staticRevString, inStr));

        System.out.println(MethodRefDemo.revDemo(myStringOps::revString, inStr));


    }
}
