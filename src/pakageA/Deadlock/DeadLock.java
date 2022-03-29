package pakageA.Deadlock;

public class DeadLock implements Runnable{

    A a =new A();
    B b = new B();

    Thread t;

    public DeadLock(){
        Thread.currentThread().setName("main thread");
        t = new Thread(this, "deadlock thread");
    }

    void deadLockStart(){
        t.start();
        a.foo(b);
        System.out.println("Back in main thread");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back in deadlock thread");
    }

    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        dl.deadLockStart();
    }
}
