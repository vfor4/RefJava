package DesignPattern.Observer.UsingList;

public class BinhThuanFanClub implements MtpSubscriber{
    @Override
    public void newPicturePosted() {
        System.out.println("from Binh Thuan with love");
    }
}
