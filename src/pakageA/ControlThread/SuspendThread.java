package pakageA.ControlThread;

public class SuspendThread {

    public static void main(String[] args) {
        NewThread n1 = new NewThread("threadOne");
        NewThread n2 = new NewThread("threadTwo");

        n1.t.start();
        n2.t.start();

        try{ System.out.println("n1 state : " +n1.t.getState());
            Thread.sleep(1000);

            n1.mysuspend();
            System.out.println("n1 state : " +n1.t.getState());
            System.out.println("Suspend thread one");
            System.out.println("inside main: " + Thread.currentThread().getName());
            Thread.sleep(1000);
            n1.myresume();
            System.out.println("state inside: " +n1.t.getState());
            System.out.println("resume thread one");

            n2.mysuspend();
            System.out.println("Suspend thread two");
            Thread.sleep(1000);
            n2.myresume();
            System.out.println("resume thread two");

        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        try{
            n1.t.join();
            n2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("exiting");
    }
}
