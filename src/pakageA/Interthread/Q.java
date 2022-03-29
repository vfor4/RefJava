package pakageA.Interthread;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }
}
