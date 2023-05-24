package DesignPattern.Decorator_Wrapper.Notify;

public class SmsNotifier implements Notifier{

    private final Notifier notifier;
    public SmsNotifier(GmailNotifier smsNotifier){
        this.notifier = smsNotifier;
    }
    @Override
    public void send() {
        if(notifier != null){
            notifier.send();
        }
        System.out.println("new sms have been send");
    }
}
