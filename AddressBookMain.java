package com.learning;

import java.util.*;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        addressBook.addContactDetails();
        addressBook.addContactDetails();
        System.out.println(addressBook.contactList);

        addressBook.modifyContactDetails();
        System.out.println(addressBook.contactList);

        addressBook.removeContactDetails();
        System.out.println(addressBook.contactList);

        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContactDetails();
        addressBook1.addContactDetails();
        System.out.println(addressBook1.contactList);
        addressBook1.modifyContactDetails();
        System.out.println(addressBook1.contactList);
        addressBook1.removeContactDetails();
        System.out.println(addressBook1.contactList);

        Dictionary dictionary = new Hashtable();
        dictionary.put(1, addressBook);
        dictionary.put(2, addressBook1);

        System.out.println(dictionary);
    }
}
