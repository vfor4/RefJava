package DesignPattern.Decorator_Wrapper.Notify;

public class GmailNotifier implements Notifier{
    private Notifier notifier;
    public GmailNotifier(Notifier notifier){
        this.notifier = notifier;
    }
    @Override
    public void send() {
        if(notifier != null){
            notifier.send();
        }
        System.out.println("mail have been sent");
    }
}
