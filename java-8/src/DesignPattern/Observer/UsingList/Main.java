package DesignPattern.Observer.UsingList;

public class Main {
    public static void main(String[] args) {

        MtpSubscriber bt = new BinhThuanFanClub();
        MtpSubscriber vt = new VungTauFanClub();

        MtpPublisher p = new MtpPublisher();

        p.subscribe(bt);
        p.subscribe(vt);

        p.releaseNewAlbum();

        p.unsubscribe(vt);
        p.releaseNewAlbum();
    }
}
