package pakageA.Interthread;

public class Caller implements Runnable{

    String msg;
    CallMe callMe;
    Thread t;

    public Caller(String msg, CallMe callMe){
        this.callMe = callMe;
        this.msg = msg;
        t = new Thread(this, "custom thread");
    }

    @Override
    public void run() {
        callMe.call(msg);
    }
}