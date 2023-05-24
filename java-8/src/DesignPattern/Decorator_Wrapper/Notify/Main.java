package DesignPattern.Decorator_Wrapper.Notify;

public class Main {
    public static void main(String[] args) {
        Notifier sms_gmail = new SmsNotifier(new GmailNotifier(null));
        Notifier gmail_sms = new GmailNotifier(new SmsNotifier(null));

        sms_gmail.send();
        gmail_sms.send();
    }
}
