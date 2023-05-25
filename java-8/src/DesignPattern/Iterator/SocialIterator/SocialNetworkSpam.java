package DesignPattern.Iterator.SocialIterator;

public class SocialNetworkSpam {
    public SocialNetwork socialNetwork;
    public ProfileIterator profileIterator;

    public SocialNetworkSpam(SocialNetwork socialNetwork){
        this.socialNetwork = socialNetwork;
    }

    public void sendSpamToFriends(String friendOfWho, String message){
        profileIterator = this.socialNetwork.createFriendsIterator(friendOfWho, ContactType.friends);
        while(profileIterator.hasNext()){
            Profile p = profileIterator.getNext();
            this.sendMessage(p.getEmail(), message);
        }
    }

    public void sendSpamToCoworker(String coworker, String message){
        profileIterator = this.socialNetwork.createCoworkersIterator(coworker, ContactType.coworkers);
        while(profileIterator.hasNext()){
            Profile p = profileIterator.getNext();
            this.sendMessage(p.getEmail(), message);
        }
    }

    private void sendMessage(String who, String message){
        System.out.println("message = " + message + "have been spammed to"+ who);
    }

}
