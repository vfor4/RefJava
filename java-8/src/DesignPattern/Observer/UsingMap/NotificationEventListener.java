package DesignPattern.Observer.UsingMap;

import java.io.File;

public class NotificationEventListener implements EventListener{
    @Override
    public void doSomethingWhenPublisherReleased(File file) {
        System.out.println("send mail to admin@gmai.com "+file.getName()+" have been deleted");

    }
}
