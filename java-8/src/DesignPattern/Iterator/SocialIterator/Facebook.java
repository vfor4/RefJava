package DesignPattern.Iterator.SocialIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Facebook implements SocialNetwork{
    public List<Profile> getProfiles() {
        return profiles;
    }

    private final List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        this.profiles = Objects.requireNonNullElseGet(cache, ArrayList::new);
    }

    public Profile requestProfileFromFacebook(String profileEmail) {
        // in real world scenario it should be called api to get data
        simulateNetworkLatency();
        System.out.println("Facebook: Loading profile '" + profileEmail + "' over the network...");
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromFacebook(String profileEmail, ContactType contactType) {
        // in real world scenario it should be called api to get data
        simulateNetworkLatency();
        System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");
        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }
    private Profile findProfile(String profileEmail) {
        // method to return data instead of call api
        for (Profile profile : profiles) {
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
        return new FacebookIterator(this, profileEmail, type);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail, ContactType type) {
        return null;
    }
}
