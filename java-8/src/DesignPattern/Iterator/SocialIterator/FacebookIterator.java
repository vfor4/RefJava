package DesignPattern.Iterator.SocialIterator;

import java.util.ArrayList;
import java.util.List;

// the target is provided 1 email and the contact type and message to spam: all emails which is related to the contact type
// so iterator must be iterated all profile which is matched to contact type
public class FacebookIterator implements ProfileIterator{
    private final Facebook facebook;
    private final ContactType type;
    private final String email;

    private final List<String> friends = new ArrayList<>();
    private final List<Profile> profiles = new ArrayList<>();

    private int currentPosition;

    public FacebookIterator(Facebook facebook, String email, ContactType type){
        this.email = email;
        this.facebook = facebook;
        this.type = type;
        this.currentPosition = 0;
        this.lazyLoad();
    }

    private void lazyLoad() {
        if (friends.size() == 0) {
            List<String> emailProfiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for (String email : emailProfiles) {
                this.friends.add(email);
                this.profiles.add(null);
            }
        }
    }
    @Override
    public Profile getNext() {
        String personalEmail = friends.get(this.currentPosition);
        Profile p = this.profiles.get(this.currentPosition);
        if (p ==  null){
            p = facebook.requestProfileFromFacebook(personalEmail);
            this.profiles.set(this.currentPosition, p);
        }
        currentPosition++;
        return p;
    }

    @Override
    public boolean hasNext() {
        return this.currentPosition < this.friends.size();
    }

    @Override
    public void clear() {
        this.currentPosition = 0;
    }
}
