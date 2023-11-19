/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcarerecordsserver;

/**
 *
 * @author Anthony
 */
public class HealthcareRecord {

    private String patientID;
    private String firstName, lastName, gender, dob, bloodType;
    private String emergencyContactName, emergencyContactRelationship, emergencyContactNumber;
    private String allergies, medicalCondition;

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactRelationship() {
        return emergencyContactRelationship;
    }

    public void setEmergencyContactRelationship(String emergencyContactRelationship) {
        this.emergencyContactRelationship = emergencyContactRelationship;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    
    public String getDetails() {
        return "C`\\goc^\\m`M`^jm_5" + "D? 8%" + patientID + " admnoI\\h` 8 " + firstName + ", g\\noI\\h`8 " + lastName + ", b`i_`m8" + gender + ", _j]8" + dob + ", ]gjj_Otk`8" + bloodType + ", `h`mb`i^t>jio\\^oI\\h`8" + emergencyContactName + ", `h`mb`i^t>jio\\^oM`g\\odjincdk8" + emergencyContactRelationship + ", `h`mb`i^t>jio\\^oIph]`m8" + emergencyContactNumber + ", \\gg`mbd`n8" + allergies + ", h`_d^\\g>ji_dodji8" + medicalCondition;
    }
    
    
    
}
