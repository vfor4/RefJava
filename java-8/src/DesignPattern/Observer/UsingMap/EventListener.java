package DesignPattern.Observer.UsingMap;

import java.io.File;

public interface EventListener {
    public void doSomethingWhenPublisherReleased(File file);
}
