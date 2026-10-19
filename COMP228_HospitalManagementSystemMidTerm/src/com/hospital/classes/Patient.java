package com.hospital.classes;

// Patient class (single inheritance from Person)
public class Patient extends Person {

    private final String patientNumber; // patient ID
    private int age;                    // age
    private String medicalDepartment;   // department
    private double consultationFee;     // fee

    private static int patientCount = 0; // counts registered patients

    public Patient(String personId, String name, String phoneNumber, String patientNumber) {
        super(personId, name, phoneNumber);
        this.patientNumber = patientNumber;
    }

    public static int getPatientCount() {
        return patientCount;
    }

    @Override
    public String getRoleDescription() {
        return "Patient";
    }

    // register patient without department
    public boolean registerPatient(String name, int age) {
        if (name == null || name.isEmpty() || age < 0 || age > 120)
            return false;

        this.name = name;
        this.age = age;
        this.medicalDepartment = "General";

        patientCount++; // count only successful registrations
        return true;
    }

    // register patient with department
    public boolean registerPatient(String name, int age, String department) {
        if (name == null || name.isEmpty() ||
            department == null || department.isEmpty() ||
            age < 0 || age > 120)
            return false;

        this.name = name;
        this.age = age;
        this.medicalDepartment = department;

        patientCount++;
        return true;
    }

    // show patient info
    public void displayPatientDetails() {
        System.out.println("Patient Number: " + patientNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + medicalDepartment);
        System.out.println("Consultation Fee: $" + consultationFee);
    }

    public void setConsultationFee(double fee) {
        if (fee >= 0) this.consultationFee = fee;
    }
}
