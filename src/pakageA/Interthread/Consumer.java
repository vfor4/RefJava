package pakageA.Interthread;

public class Consumer implements Runnable{

    Q q;
    public Thread t;


    public Consumer(Q q){
        t = new Thread(this, "Consumer");
        this.q = q;
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}
