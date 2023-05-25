package DesignPattern.Singleton;

public class BillPush {

    private BillPush(){
    }

    private static final class SingletonHolder{
        private static final BillPush BILL_PUSH = new BillPush();
    }

    public static BillPush getInstance(){
        return SingletonHolder.BILL_PUSH;
    }
}
