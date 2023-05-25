package DesignPattern.Iterator.SocialIterator;

import java.util.ArrayList;
import java.util.List;

public class LinkedInIterator implements ProfileIterator {
    private final LinkedIn linkedIn;
    private int currentPosition;

    private List<String> friendEmails = new ArrayList<>();

    private final List<Profile> friendProfiles = new ArrayList<>();

    private final ContactType type;

    private final String profileEmail;

    public LinkedInIterator(LinkedIn linkedIn, ContactType type, String profileEmail) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.profileEmail = profileEmail;
        this.currentPosition = 0;
        this.lazyLoading();
    }

    private void lazyLoading() {
        if (friendEmails.size() == 0) {
            this.friendEmails = this.linkedIn.requestRelatedContactsFromLinkedInAPI(this.profileEmail, this.type);
        }
    }

    @Override
    public Profile getNext() {
        if(!hasNext()) return null;
        Profile p = this.linkedIn.requestContactInfoFromLinkedInAPI(this.friendEmails.get(this.currentPosition));
        this.currentPosition++;
        return p;
    }

    @Override
    public boolean hasNext() {
        return this.currentPosition < this.friendEmails.size();
    }

    @Override
    public void clear() {
        this.currentPosition = 0;
    }
}
