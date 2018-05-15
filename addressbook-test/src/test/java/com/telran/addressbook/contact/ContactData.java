package com.telran.addressbook.contact;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String telefon;
    private final String home;
    private final String addNew;


    public ContactData(String FirstName, String LastName, String Address, String telefon, String Home, String addNew, String login) {
        firstName = FirstName;
        lastName = LastName;
        address = Address;
        this.telefon = telefon;
        home = Home;
        this.addNew = addNew;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getHome() {
        return home;
    }

    public String getAddNew() {
        return addNew;
    }


}
