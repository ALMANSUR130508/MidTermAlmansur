package com.hospital.classes;

// Abstract class for all medical staff
public abstract class MedicalStaff extends Person {

    protected final String staffId;   // staff ID
    protected String department;      // department
    protected double monthlySalary;   // base salary

    protected static int staffCount = 0; // counts staff

    public MedicalStaff(String personId, String name, String phoneNumber,
                        String staffId, String department, double monthlySalary) {
        super(personId, name, phoneNumber);
        this.staffId = staffId;
        this.department = department;
        this.monthlySalary = monthlySalary;
        staffCount++; // count staff
    }

    public static int getStaffCount() {
        return staffCount;
    }

    // each staff type must calculate compensation
    public abstract double calculateMonthlyCompensation();

    // show staff info
    public void displayStaffDetails() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: $" + monthlySalary);
    }

    @Override
    public String getRoleDescription() {
        return "Medical Staff";
    }
}
