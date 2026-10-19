package com.hospital.classes;

// Abstract base class for all people in the system
public abstract class Person {

    protected final String personId;   // unique ID
    protected String name;             // full name
    protected String phoneNumber;      // phone number

    protected static int personCount = 0; // counts all people

    public Person(String personId, String name, String phoneNumber) {
        this.personId = personId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        personCount++; // increase when a person is created
    }

    public static int getPersonCount() {
        return personCount;
    }

    // show basic info
    public void displayBasicDetails() {
        System.out.println("ID: " + personId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
    }

    // each subclass must describe its role
    public abstract String getRoleDescription();

    @Override
    public String toString() {
        return personId + " - " + name + " (" + getRoleDescription() + ")";
    }
}
