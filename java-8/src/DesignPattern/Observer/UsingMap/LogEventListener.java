package DesignPattern.Observer.UsingMap;

import java.io.File;

public class LogEventListener implements EventListener{
    @Override
    public void doSomethingWhenPublisherReleased(File file) {
        System.out.println("log " + file.getName() + " into logstash");

    }
}
