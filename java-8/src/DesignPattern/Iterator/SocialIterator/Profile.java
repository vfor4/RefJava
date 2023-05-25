package DesignPattern.Iterator.SocialIterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    private final String name;
    private final String email;
    private final Map<ContactType, List<String>> contacts = new HashMap<>();

    public Profile(String email, String name, String... contactEmails) {
        this.name = name;
        this.email = email;

        for (String s : contactEmails) {
            // "friends:Ha_binh@ya.com" "co-worker: ngoc_lan@splus.vn"
            String[] parseContact = s.split(":");
            ContactType contactType = ContactType.valueOf(parseContact[0]);
            String contactData = parseContact[1];
            if (!contacts.containsKey(contactType)) {
                contacts.put(contactType, new ArrayList<>());
            }
            contacts.get(contactType).add(contactData);
        }
    }

    public List<String> getContacts(ContactType type) {
        return contacts.get(type);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
