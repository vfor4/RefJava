package DesignPattern.Observer.UsingMap;

public class Main {
    public static void main(String[] args) {
        LogEventListener logEventListener = new LogEventListener();
        NotificationEventListener notificationEventListener = new NotificationEventListener();

        FileService fileService = new FileService();
        fileService.getEventManager().subscribe("open", logEventListener);
        fileService.getEventManager().subscribe("delete", notificationEventListener);
        fileService.openFile("abc.txt");

        fileService.deleteFile("abc.txt");

    }
}
