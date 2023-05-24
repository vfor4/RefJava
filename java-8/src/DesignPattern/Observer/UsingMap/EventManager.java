package DesignPattern.Observer.UsingMap;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<String, List<EventListener>> map = new HashMap<>();
    public EventManager(String... strings){
        for (String s :  strings) {
            map.put(s, new ArrayList<>());
        }
    }

    public boolean subscribe(String typeOfEvent, EventListener eventListener){
        return map.get(typeOfEvent).add(eventListener);
    }

    public boolean unsubscribe(String typeOfEvent, EventListener eventListener){
        return map.get(typeOfEvent).remove(eventListener);
    }

    public void publish(String typeOfEvent, File file){
        for (EventListener e: map.get(typeOfEvent) ) {
            e.doSomethingWhenPublisherReleased(file);
        }
    }
}
