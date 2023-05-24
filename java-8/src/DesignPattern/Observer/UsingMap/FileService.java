package DesignPattern.Observer.UsingMap;

import java.io.File;

public class FileService {
    private final EventManager eventManager;

    public FileService(){
        eventManager = new EventManager("open", "delete");
    }
    public EventManager getEventManager(){
        return this.eventManager;
    }

    public void openFile(String path){
        System.out.println("opened file event");
        File file = new File(path);
        this.eventManager.publish("open", file);
    }

    public void deleteFile(String path){
        System.out.println("deleted file event");
        File file = new File(path);
        this.eventManager.publish("delete", file);
    }
}
