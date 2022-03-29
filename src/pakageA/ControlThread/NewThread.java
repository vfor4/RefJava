package pakageA.ControlThread;
public class NewThread implements Runnable{
    String name;
    Thread t;

    boolean suspendFlag;
    public NewThread(String name){
        this.name = name;
        t = new Thread(this, name);
        System.out.println("new thread: " + name);
        suspendFlag = false;
    }

    @Override
    public void run() {
        try{
            for (int i = 15; i >0 ; i--) {
                System.out.println(name +" "+ i);
                Thread.sleep(200);
                System.out.println("inside "+name+" : " + Thread.currentThread().getName());
                synchronized(this){
                    while(suspendFlag){
                        wait();
                    }
                }

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + "existing");
    }

    synchronized void mysuspend(){
        suspendFlag = true;
    }

    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}


