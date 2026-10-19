package com.hospital.classes;

// Nurse class (hierarchical inheritance)
public class Nurse extends MedicalStaff {

    private final String shiftType;     // shift type
    private final double shiftAllowance; // extra pay

    public Nurse(String personId, String name, String phoneNumber, String staffId,
                 String department, double monthlySalary, String shiftType, double shiftAllowance) {

        super(personId, name, phoneNumber, staffId, department, monthlySalary);
        this.shiftType = shiftType;
        this.shiftAllowance = shiftAllowance;
    }

    // salary + shift allowance
    @Override
    public double calculateMonthlyCompensation() {
        return monthlySalary + shiftAllowance;
    }

    @Override
    public void displayStaffDetails() {
        super.displayStaffDetails();
        System.out.println("Shift: " + shiftType);
        System.out.println("Shift Allowance: $" + shiftAllowance);
    }

    @Override
    public String getRoleDescription() {
        return "Nurse";
    }
}
