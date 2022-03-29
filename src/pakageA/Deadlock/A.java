package pakageA.Deadlock;

public class A {
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " Trying to call B.last()");
        b.last();
    }

    synchronized void last(){
        System.out.println("inside A.last");
    }
}
