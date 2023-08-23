package Contacts;

import java.util.Objects;

public class Contact {
    private final String name;
    private final String phoneNumber;
    private final String group;

    public Contact(String name, String phoneNumber, String group) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber) &&
                Objects.equals(name, contact.name) &&
                Objects.equals(group, contact.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, name, group);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return phoneNumber;
    }

    public String getGroup() {
        return group;
    }
}
