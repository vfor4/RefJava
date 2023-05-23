package DesignPattern.Observer.UsingList;

public class VungTauFanClub implements MtpSubscriber{
    @Override
    public void newPicturePosted() {
        System.out.println("From Vung Tau with love");
    }
}
