package Contacts;

public class Contact {
    private final String name;
    private final String phoneNumber;
    private final String group;

    public Contact(String name, String phoneNumber, String group) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.group = group;
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
