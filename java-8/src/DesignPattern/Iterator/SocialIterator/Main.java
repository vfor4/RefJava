package DesignPattern.Iterator.SocialIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Facebook facebook = new Facebook(createTestProfiles());
        SocialNetworkSpam sp = new SocialNetworkSpam(facebook);

        sp.sendSpamToFriends("anna.smith@bing.com", "spam holahahahahaah");

        LinkedIn linkedIn = new LinkedIn(createTestProfiles());
        SocialNetworkSpam sl = new SocialNetworkSpam(linkedIn);

        sl.sendSpamToCoworker("sam@amazon.com", "java dev 1 year experience");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<>();
        data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }
}
