/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anthony
 */
public class GUI2 extends javax.swing.JFrame {

    /**
     * Creates new form GUI2
     */
    private static InetAddress host;
    private static final int PORT = 1234;
    private static Socket link = null;
    private static int id = 100;
    private static int key = 5;
    

    public GUI2() {
        initComponents();
        try {
            host = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println("Host ID not found!");
            System.exit(1);
        }
    }
    public static String encrypt(String text, int key) {
        ArrayList<Character> encrypted = new ArrayList<>();
        char[] ch = text.toCharArray();
        for (char c: ch) {
            c -= key;
            encrypted.add(c);
            }
        StringBuilder stringBuilder = new StringBuilder();
        for (char cf : encrypted) {
            stringBuilder.append(cf);
        }
        String concatenatedString = stringBuilder.toString();
 
        // Display the concatenated string
        return concatenatedString;
    }
    public static String decrypt(String text, int key) {
        ArrayList<Character> decrypted = new ArrayList<>();
        char[] ch = text.toCharArray();
        for (char c: ch) {
            c += key;
            decrypted.add(c);
            }
        StringBuilder stringBuilder = new StringBuilder();
        for (char cf : decrypted) {
            stringBuilder.append(cf);
        }
        String concatenatedString = stringBuilder.toString();
 
        // Display the concatenated string
        return concatenatedString;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        PatientGenderCB = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        PatientFirstNameTF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        MedicalConditionsTA1 = new javax.swing.JTextArea();
        PatientDOBTF = new javax.swing.JTextField();
        PatientSurnameTF = new javax.swing.JTextField();
        PatientBloodTF = new javax.swing.JTextField();
        ECNumber1TF = new javax.swing.JTextField();
        ECRelationship1TF = new javax.swing.JTextField();
        PatientFirstNameLBL = new javax.swing.JLabel();
        PatientSurnameLBL = new javax.swing.JLabel();
        PatientDOBLBL = new javax.swing.JLabel();
        PatientGenderLBL = new javax.swing.JLabel();
        PatientBloodLBL = new javax.swing.JLabel();
        ECName1LBL = new javax.swing.JLabel();
        ECRelationship1LBL = new javax.swing.JLabel();
        ECNumber1LBL = new javax.swing.JLabel();
        ECName1TF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicalConditionsTA = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        listButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        patientIDSearchTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel18.setText("Emergency Contacts");

        jLabel21.setText("Known Medical Conditions ");

        PatientGenderCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Transgender Male", "Transgender Female", "Non-Binary" }));

        jLabel22.setText("Allergies ");

        addButton.setText("Add Details");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        MedicalConditionsTA1.setColumns(20);
        MedicalConditionsTA1.setRows(5);
        jScrollPane2.setViewportView(MedicalConditionsTA1);

        PatientFirstNameLBL.setText("First Name");

        PatientSurnameLBL.setText("Surname");

        PatientDOBLBL.setText("D.O.B");

        PatientGenderLBL.setText("Gender");

        PatientBloodLBL.setText("Blood Type");

        ECName1LBL.setText("Full Name ");

        ECRelationship1LBL.setText("Relationship");

        ECNumber1LBL.setText("Contact Number");

        jLabel17.setText("Personal Information");

        MedicalConditionsTA.setColumns(20);
        MedicalConditionsTA.setRows(5);
        jScrollPane1.setViewportView(MedicalConditionsTA);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(PatientGenderLBL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PatientGenderCB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(PatientFirstNameLBL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PatientFirstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PatientDOBLBL)
                                    .addComponent(PatientSurnameLBL))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PatientSurnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(PatientDOBTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(PatientBloodLBL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PatientBloodTF, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 224, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ECName1LBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ECName1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(ECRelationship1LBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ECRelationship1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(ECNumber1LBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ECNumber1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientFirstNameLBL)
                    .addComponent(PatientSurnameLBL)
                    .addComponent(PatientFirstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientSurnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientGenderCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientGenderLBL)
                    .addComponent(PatientDOBLBL)
                    .addComponent(PatientDOBTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientBloodLBL)
                    .addComponent(PatientBloodTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ECRelationship1LBL)
                        .addComponent(ECNumber1LBL)
                        .addComponent(ECNumber1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ECRelationship1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ECName1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ECName1LBL))
                .addGap(33, 33, 33)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane3.setViewportView(displayTA);

        listButton.setText("List");
        listButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Patient ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(566, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientIDSearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(patientIDSearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:

            
            String firstName = PatientFirstNameTF.getText();
            String lastName = PatientSurnameTF.getText();
            String gender = PatientGenderCB.getSelectedItem().toString();
            String dob = PatientDOBTF.getText();  // Assuming YYYY-MM-DD format
            String bloodType = PatientBloodTF.getText();
            String emergencyContactName = ECName1TF.getText();
            String emergencyContactRelationship = ECRelationship1TF.getText();
            String emergencyContactNumber = ECNumber1TF.getText();
            String allergies = MedicalConditionsTA1.getText();
            String medicalCondition =  MedicalConditionsTA.getText() ;
       
        try {
            link = new Socket(host, PORT);

            BufferedReader in = new BufferedReader(new InputStreamReader(link.getInputStream()));
            PrintWriter out = new PrintWriter(link.getOutputStream(), true);

            BufferedReader userEntry = new BufferedReader(new InputStreamReader(System.in));
            String patientID = Integer.toString(id);
            patientID = encrypt(patientID,key);
            firstName = encrypt(firstName,key);
            lastName = encrypt(lastName,key);
            gender = encrypt(gender,key);
            dob = encrypt(dob,key);
            bloodType = encrypt(bloodType,key);
            emergencyContactName = encrypt(emergencyContactName,key);
            emergencyContactRelationship = encrypt(emergencyContactRelationship,key);
            emergencyContactNumber = encrypt(emergencyContactNumber,key);
            allergies = encrypt(allergies,key);
            medicalCondition = encrypt(medicalCondition,key);
            
            
            
            out.println("add");
            out.println(patientID);
            out.println(firstName);
            out.println(lastName);
            out.println(gender);
            out.println(dob);
            out.println(bloodType);
            out.println(emergencyContactName);
            out.println(emergencyContactRelationship);
            out.println(emergencyContactNumber);
            out.println(allergies);
            out.println(medicalCondition);
            
            id++;
            

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("\n* Closing connection... *");
                link.close();
            } catch (IOException e) {
                System.out.println("Unable to disconnect/close!");
                System.exit(1);
            }
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        // TODO add your handling code here:
         displayTA.setText("");
        try {
            link = new Socket(host, PORT);

            BufferedReader in = new BufferedReader(new InputStreamReader(link.getInputStream()));
            PrintWriter out = new PrintWriter(link.getOutputStream(), true);

            BufferedReader userEntry = new BufferedReader(new InputStreamReader(System.in));

            out.println("list");
            String patient;
            int list = Integer.parseInt(in.readLine());
            for (int i = 0; i < list; i++) {
                patient = in.readLine();
                patient = decrypt(patient,key);
                displayTA.setText(displayTA.getText() + patient + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("\n* Closing connection... *");
                link.close();
            } catch (IOException e) {
                System.out.println("Unable to disconnect/close!");
                System.exit(1);
            }
        }

    }//GEN-LAST:event_listButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String patientID = patientIDSearchTF.getText();
        
        try {
            link = new Socket(host, PORT);

            BufferedReader in = new BufferedReader(new InputStreamReader(link.getInputStream()));
            PrintWriter out = new PrintWriter(link.getOutputStream(), true);

            BufferedReader userEntry = new BufferedReader(new InputStreamReader(System.in));
            
            out.println("search");
            patientID = encrypt(patientID,key);
            out.println(patientID);
            String patient;
            patient = in.readLine();
            patient = decrypt(patient,key);
            displayTA.setText(patient);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("\n* Closing connection... *");
                link.close();
            } catch (IOException e) {
                System.out.println("Unable to disconnect/close!");
                System.exit(1);
            }
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ECName1LBL;
    private javax.swing.JTextField ECName1TF;
    private javax.swing.JLabel ECNumber1LBL;
    private javax.swing.JTextField ECNumber1TF;
    private javax.swing.JLabel ECRelationship1LBL;
    private javax.swing.JTextField ECRelationship1TF;
    private javax.swing.JTextArea MedicalConditionsTA;
    private javax.swing.JTextArea MedicalConditionsTA1;
    private javax.swing.JLabel PatientBloodLBL;
    private javax.swing.JTextField PatientBloodTF;
    private javax.swing.JLabel PatientDOBLBL;
    private javax.swing.JTextField PatientDOBTF;
    private javax.swing.JLabel PatientFirstNameLBL;
    private javax.swing.JTextField PatientFirstNameTF;
    private javax.swing.JComboBox<String> PatientGenderCB;
    private javax.swing.JLabel PatientGenderLBL;
    private javax.swing.JLabel PatientSurnameLBL;
    private javax.swing.JTextField PatientSurnameTF;
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton listButton;
    private javax.swing.JTextField patientIDSearchTF;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
