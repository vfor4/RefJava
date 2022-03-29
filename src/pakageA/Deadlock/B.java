package pakageA.Deadlock;

public class B {
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.foo");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " Trying to call A.last()");
        a.last();
    }

    synchronized void last(){
        System.out.println("inside B.last");
    }
}
