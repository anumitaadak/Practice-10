package com.learning;

import java.util.*;

public class AddressBook {

    List<ContactPerson> contactList = new ArrayList<>();

    public void addContactDetails(){

        ContactPerson contactPerson = new ContactPerson();

        System.out.println("Enter name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter contact number");
        int number = scanner1.nextInt();

        contactPerson.setName(name);
        contactPerson.setNumber(number);

        System.out.println(contactPerson.getName());

        contactList.add(contactPerson);

    }

    public void removeContactDetails() {
        System.out.println("Enter the name of person you want to delete ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for(ContactPerson contactPerson : contactList) {
            if(contactPerson.getName().equals(name)){
                contactList.remove(contactPerson);
                break;
            }
        }

        System.out.println("Modified list: "+contactList);
    }

    public void modifyContactDetails() {
        System.out.println("Enter the name of person you want to edit ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println(" list: "+contactList);

        for(ContactPerson contactPerson : contactList) {
            if(contactPerson.getName().equals(name)){
                contactPerson.setName("Sima");
                break;
            }
        }
        System.out.println("Modified list: "+contactList);
    }
    
    @Override
    public String toString() {
        return "AddressBook{" +
                "contactList=" + contactList +
                '}';
    }
}
