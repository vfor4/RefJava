package DesignPattern.Observer.UsingList;

import java.util.ArrayList;
import java.util.List;

public class MtpPublisher {
    private final List<MtpSubscriber> lists = new ArrayList<>();

    public boolean subscribe(MtpSubscriber mtpSubscriber){
        return lists.add(mtpSubscriber);
    }

    public boolean unsubscribe(MtpSubscriber mtpSubscriber){
        return lists.remove(mtpSubscriber);
    }

    public void releaseNewAlbum(){
        System.out.println("MTP Entertainment introduced new episode");
        this.notifyToAllSubscribers();
    }

    private void notifyToAllSubscribers(){
        lists.forEach(MtpSubscriber::newPicturePosted);
    }
}
