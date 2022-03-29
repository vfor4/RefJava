package pakageA.Interthread;

public class Producer implements Runnable {

    Q q;
    public Thread t;

    public Producer(Q q){
        t = new Thread(this, "producer");
        this.q = q;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            q.put(i++);
        }
    }

}
