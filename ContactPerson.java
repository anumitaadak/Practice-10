package com.learning;

public class ContactPerson {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String personName) {
        name = personName;
    }

    public void setNumber(int contactNumber){
        number = contactNumber;
    }

    @Override
    public String toString() {
        return("name: "+name+"\n"+"contact number: "+number);
    }
}
