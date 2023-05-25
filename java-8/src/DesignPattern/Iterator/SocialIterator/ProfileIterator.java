package DesignPattern.Iterator.SocialIterator;

public interface ProfileIterator {
    Profile getNext();

    boolean hasNext();

    // reset idx to 0;
    void clear();
}
