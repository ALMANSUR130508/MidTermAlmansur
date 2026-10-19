package com.hospital.classes;

public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("CAREPOINT HOSPITAL");
        System.out.println("MANAGEMENT SYSTEM");
        System.out.println("========================================");

        // Register Patients
        Patient p1 = new Patient("P1001", "Priya Sharma", "111-222", "PT001");
        boolean reg1 = p1.registerPatient("Priya Sharma", 35, "Cardiology");
        p1.setConsultationFee(150);

        Patient p2 = new Patient("P1002", "Daniel Brown", "333-444", "PT002");
        boolean reg2 = p2.registerPatient("Daniel Brown", 42, "General Medicine");
        p2.setConsultationFee(150);

        System.out.println("\nPATIENT REGISTRATION");

        System.out.println("Patient Number: P1001");
        System.out.println("Name: " + p1.name);
        System.out.println("Age: 35");
        System.out.println("Department: Cardiology");
        System.out.println("Registration Status: " + (reg1 ? "Successful" : "Failed"));
        System.out.println();

        System.out.println("Patient Number: P1002");
        System.out.println("Name: " + p2.name);
        System.out.println("Age: 42");
        System.out.println("Department: General Medicine");
        System.out.println("Registration Status: " + (reg2 ? "Successful" : "Failed"));

        // Doctor
        Doctor d1 = new Doctor("D2001", "Dr. Amit Kumar", "555-666", "ST001",
                "Cardiology", 9000, 150, 100);

        System.out.println("\nDOCTOR DETAILS");
        System.out.println("Staff ID: D2001");
        System.out.println("Name: Dr. Amit Kumar");
        System.out.println("Department: Cardiology");
        System.out.println("Monthly Salary: $9000.00");
        System.out.println("Patients Seen: 100");
        System.out.println("Consultation Fee: $150.00");
        System.out.println("Monthly Compensation: $" + d1.calculateMonthlyCompensation());

        // Specialist Doctor
        SpecialistDoctor sd1 = new SpecialistDoctor("D2002", "Dr. Neha Patel", "777-888", "ST002",
                "Neurology", 12000, 200, 80, "Neurology", 50);

        System.out.println("\nSPECIALIST DOCTOR DETAILS");
        System.out.println("Staff ID: D2002");
        System.out.println("Name: Dr. Neha Patel");
        System.out.println("Specialization: Neurology");
        System.out.println("Consultation Fee: $" + sd1.calculateConsultationFee());

        // Nurse
        Nurse n1 = new Nurse("N3001", "Mark Wilson", "999-000", "ST003",
                "Emergency", 5000, "Night", 500);

        System.out.println("\nNURSE DETAILS");
        System.out.println("Staff ID: N3001");
        System.out.println("Name: Mark Wilson");
        System.out.println("Department: Emergency");
        System.out.println("Shift: Night");
        System.out.println("Monthly Compensation: $" + n1.calculateMonthlyCompensation());

        // Consultation Fee Calculations
        System.out.println("\nCONSULTATION FEE CALCULATIONS");
        System.out.println("Standard Consultation Fee: $150.00");
        System.out.println("Consultation Fee After Discount: $" + d1.calculateConsultationFee(15));
        System.out.println("Consultation Fee With Additional Charge: $" + d1.calculateConsultationFee(15, 40));

        // Registration Summary
        System.out.println("\nREGISTRATION SUMMARY");
        System.out.println("Total People: " + Person.getPersonCount());
        System.out.println("Total Patients: " + Patient.getPatientCount());
        System.out.println("Total Medical Staff: " + MedicalStaff.getStaffCount());

        System.out.println("========================================");
        System.out.println("END OF REPORT");
        System.out.println("========================================");
    }
}
