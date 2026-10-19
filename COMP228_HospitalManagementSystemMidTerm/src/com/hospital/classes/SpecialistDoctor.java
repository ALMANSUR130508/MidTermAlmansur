package com.hospital.classes;

// Specialist doctor (multilevel inheritance)
public class SpecialistDoctor extends Doctor {

    private final String specialization;     // specialty
    private final double specialistSurcharge; // extra fee

    public SpecialistDoctor(String personId, String name, String phoneNumber, String staffId,
                            String department, double monthlySalary, double consultationFee,
                            int patientsSeen, String specialization, double specialistSurcharge) {

        super(personId, name, phoneNumber, staffId, department, monthlySalary, consultationFee, patientsSeen);
        this.specialization = specialization;
        this.specialistSurcharge = specialistSurcharge;
    }

    // fee + surcharge
    @Override
    public double calculateConsultationFee() {
        return consultationFee + specialistSurcharge;
    }

    @Override
    public void displayStaffDetails() {
        super.displayStaffDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Specialist Surcharge: $" + specialistSurcharge);
    }

    // specialist compensation formula
    @Override
    public double calculateMonthlyCompensation() {
        return monthlySalary + (patientsSeen * 20);
    }

    @Override
    public String getRoleDescription() {
        return "Specialist Doctor";
    }
}
