package DesignPattern.Iterator.SocialIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail, ContactType type);

    ProfileIterator createCoworkersIterator(String profileEmail, ContactType type);
}
