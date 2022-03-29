package pakageA;


import java.io.*;
import java.lang.annotation.Annotation;
import java.nio.file.Files;
import static java.lang.System.out;

//@What("help")
//@MyAnno(val = "Class HelloWorld", intVal = 1)
public class HelloWorld {


    public int name;
    public int val;

    HelloWorld(int a, int b){
        name = a;
        val = b;
    }

    HelloWorld(int a){
        this(a,a);
    }

    HelloWorld(){
        this(0);
    }

//    @What("method?")
//    @MyAnno(val = "throw one method", intVal = 4)
    public static double throwOne(double b, double a) {
        return b / a;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j=1; j < i; j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    int[] result1 = {i, j};
                    return result1;
                }
            }
        }
        return result;
    }
    static int ia = 4;
    public static int getNum(){

        return ia--;
    }

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 9; i++) {
            int a = getNum();
            assert a > 0: "n is not positive, hopefully i will improve my english skill";
            out.println(a);


        }

//        System.out.println(HelloWorld.throwOne(5.66698d,5.45489786315d));
        /*


        try(FileInputStream f = new FileInputStream("newworld.txt")) {
             int c;
            do{
                c = f.read();
                System.out.print(c);

            }while(c != -1);
            int i = 0;
            int[] a = {i, 2};
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }*/







//   System.out.write('\n');
       /* try {
            p.t.join();
            c.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/




        /*packageA target = new packageA();

        Caller call1 = new Caller("One", target);
        Caller call2 = new Caller("Two", target);
        Caller call3 = new Caller("Three", target);

        call1.t.start();
        call2.t.start();
        call3.t.start();

        try {
            call1.t.join();
            call2.t.join();
            call3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }
}
