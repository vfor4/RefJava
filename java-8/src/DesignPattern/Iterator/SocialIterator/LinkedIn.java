package DesignPattern.Iterator.SocialIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// this code from: https://refactoring.guru/design-patterns/iterator/java/example
public class LinkedIn implements SocialNetwork{
    private final List<Profile> contacts;
    public LinkedIn(List<Profile> cache) {
        this.contacts = Objects.requireNonNullElseGet(cache, ArrayList::new);
    }

    public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {
        // Here would be a POST request to one of the LinkedIn API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading profile '" + profileEmail + "' over the network...");

        // ...and return test data.
        return findContact(profileEmail);
    }

    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, ContactType contactType) {
        // Here would be a POST request to one of the LinkedIn API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life.
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        // ...and return test data.
        Profile profile = findContact(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findContact(String profileEmail) {
        for (Profile profile : contacts) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail, ContactType type) {
        return null;
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail, ContactType type) {
        return new LinkedInIterator(this, type, profileEmail);
    }
}
