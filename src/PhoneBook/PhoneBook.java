package PhoneBook;

import Contacts.Contact;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PhoneBook {
//    private List<Contact> contacts;
//
//    public PhoneBook() {
//        contacts = new ArrayList<>();
//    }
//
//    public void addContact(String name, String phoneNumber, String group) {
//        if (contacts.isEmpty()){
//            Contact newContact = new Contact(name, phoneNumber, group);
//            contacts.add(newContact);
//            System.out.println("Контакт с номером " + phoneNumber + " успешно добавлен.");
//            return;
//        }
//        for (int i = 0; i < contacts.size(); i++) {
//            if (contacts.get(i).getNumber().equals(phoneNumber) &&
//                    contacts.get(i).getName().equals(name) &&
//                    contacts.get(i).getGroup().equals(group)){
//                System.out.println("Данный контакт уже существует.");
//                return;
//            }
//        }
//        Contact newContact = new Contact(name, phoneNumber, group);
//        contacts.add(newContact);
//        System.out.println("Контакт с номером " + phoneNumber + " успешно добавлен.");
//    }
//
//    public List<Contact> foundByContactFragment(String fragment) {
//        // new empty list for found contacts
//        List<Contact> foundContact = new ArrayList<>();
//        for (Contact contact: contacts) {
//            if (contact.getNumber().contains(fragment)){
//                foundContact.add(contact);
//            }
//        }
//        return foundContact;
//    }

    private Set<Contact> contacts;

    public PhoneBook() {
        contacts = new HashSet<>();
    }

    public void addContact(String name, String phoneNumber, String group) {
        Contact newContact = new Contact(name, phoneNumber, group);

        if (contacts.contains(newContact)){
            System.out.println("Данный контакт уже существует.");
            return;
        }

        contacts.add(newContact);
        System.out.println("Контакт с номером " + phoneNumber + " успешно добавлен.");
    }

    public Set<Contact> foundByContactFragment(String fragment){
        Set<Contact> foundContact = new HashSet<>();
        for (Contact contact : contacts){
            if (contact.getNumber().contains(fragment)){
                foundContact.add(contact);
            }
        }
        return foundContact;
    }

}
