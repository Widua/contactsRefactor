package phonebook;

import models.Contact;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts ;
    private static final PhoneBook instance = new PhoneBook() ;

    private PhoneBook(){}


    public static PhoneBook getInstance() {
        return instance;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
