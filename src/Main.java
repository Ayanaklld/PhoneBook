import Contacts.Contact;
import PhoneBook.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Moti", "87055655598", "family");
        phoneBook.addContact("Alina", "87471115522", "friends");
        phoneBook.addContact("Temirlan", "87074546633", "work");
        phoneBook.addContact("Temirlan", "87074546633", "work");

        List<Contact> result = phoneBook.foundByContactFragment("705");
        for (Contact contact: result){
            System.out.println(contact.getName() + " " + contact.getNumber() + " " + contact.getGroup());
        }


    }
}
