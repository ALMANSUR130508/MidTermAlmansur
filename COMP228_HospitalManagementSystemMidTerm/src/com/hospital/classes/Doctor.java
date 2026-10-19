package com.hospital.classes;

import com.hospital.interfaces.Reportable;
import com.hospital.interfaces.Schedulable;

// Doctor class (hierarchical inheritance + interfaces)
public class Doctor extends MedicalStaff implements Reportable, Schedulable {

    protected final double consultationFee; // base fee
    protected int patientsSeen;             // number of patients

    public Doctor(String personId, String name, String phoneNumber, String staffId,
                  String department, double monthlySalary, double consultationFee, int patientsSeen) {
        super(personId, name, phoneNumber, staffId, department, monthlySalary);
        this.consultationFee = consultationFee;
        this.patientsSeen = patientsSeen;
    }

    // salary + bonus
    @Override
    public double calculateMonthlyCompensation() {
        return monthlySalary + (patientsSeen * 10);
    }

    @Override
    public void displayStaffDetails() {
        super.displayStaffDetails();
        System.out.println("Patients Seen: " + patientsSeen);
        System.out.println("Consultation Fee: $" + consultationFee);
    }

    @Override
    public String getRoleDescription() {
        return "Doctor";
    }

    // overloaded methods
    public double calculateConsultationFee() {
        return consultationFee;
    }

    public double calculateConsultationFee(double discount) {
        if (discount < 0 || discount > consultationFee)
            return consultationFee;
        return consultationFee - discount;
    }

    public double calculateConsultationFee(double discount, double additionalCharge) {
        if (discount < 0 || discount > consultationFee || additionalCharge < 0)
            return consultationFee;
        return consultationFee - discount + additionalCharge;
    }

    @Override
    public void generateReport() {
        System.out.println("Doctor Report Generated.");
    }

    @Override
    public void scheduleAppointment(String appointmentDate) {
        System.out.println("Appointment scheduled on: " + appointmentDate);
    }
}
