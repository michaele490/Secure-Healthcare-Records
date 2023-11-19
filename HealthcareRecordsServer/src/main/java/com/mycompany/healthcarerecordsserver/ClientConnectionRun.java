/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcarerecordsserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anthony
 */
public class ClientConnectionRun implements Runnable {

    private static Socket client_link = null;
    String clientID;
    private static ArrayList<HealthcareRecord> recordArray = new ArrayList<HealthcareRecord>();
    private static String patientID;
    private static String firstName;
    private static String lastName;
    private static String gender;
    private static String dob;  // Assuming YYYY-MM-DD format
    private static String bloodType;
    private static String emergencyContactName;
    private static String emergencyContactRelationship;
    private static String emergencyContactNumber;
    private static String allergies;
    private static String medicalCondition;

    public ClientConnectionRun(Socket connection, String cID) {
        this.client_link = connection;
        clientID = cID;
    }

    private static void add() {

        HealthcareRecord p = new HealthcareRecord();
        p.setPatientID(patientID);
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setGender(gender);
        p.setDob(dob);
        p.setBloodType(bloodType);
        p.setEmergencyContactName(emergencyContactName);
        p.setEmergencyContactRelationship(emergencyContactRelationship);
        p.setEmergencyContactNumber(emergencyContactNumber);
        p.setAllergies(allergies);
        p.setMedicalCondition(medicalCondition);

        recordArray.add(p);
        
        System.out.println(p.getDetails());

    }

    private static void search() {
        PrintWriter out;

        try {
            out = new PrintWriter(client_link.getOutputStream(), true);

            if (recordArray.isEmpty()) {
                out.print("empty");
            } else {
                String searchterm = patientID;
                System.out.println(patientID);
                for (HealthcareRecord g : recordArray) {
                    if (g.getPatientID().equals(searchterm)) {
                        out.println(g.getDetails());
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientConnectionRun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void list(){
        
            PrintWriter out;
        try {
            out = new PrintWriter(client_link.getOutputStream(), true);
            if (recordArray.isEmpty()){
                    out.print("empty");
                }else{
                System.out.println(recordArray.size());
                    out.println(recordArray.size());
                    for (HealthcareRecord g : recordArray) {
            System.out.println(g.getDetails());
            out.println(g.getDetails());
                }
        
        }
        } catch (IOException ex) {
            Logger.getLogger(ClientConnectionRun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(client_link.getInputStream())); //Step 3.
            PrintWriter out = new PrintWriter(client_link.getOutputStream(), true); //Step 3.
            String method;
            method = in.readLine();
            
            if (method.equalsIgnoreCase("add")){
                
            patientID = in.readLine();
            firstName = in.readLine();
            lastName = in.readLine();
            gender = in.readLine();
            dob = in.readLine();// Assuming YYYY-MM-DD format
            bloodType = in.readLine();
            emergencyContactName = in.readLine();
            emergencyContactRelationship = in.readLine();
            emergencyContactNumber = in.readLine();
            allergies = in.readLine();
            medicalCondition = in.readLine();
            add();
            }else if (method.equalsIgnoreCase("search")){
                patientID = in.readLine();System.out.println(patientID);
                search();
                
            }
            else{
                list();
            }
            

            

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("\n* Closing connection with the client " + clientID + " ... *");
                client_link.close();				    //Step 5.
            } catch (IOException e) {
                System.out.println("Unable to disconnect!");
            }
        }
    }
}
