/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Anthony
 */
public class SecurityFundamentalsAndDevelopmentProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         GUI2 g= new GUI2();
         g.setVisible(true);
         
        /* try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc", "root", ""
            );

            // Create a statement
            Statement statement = null;
             try {
                 statement = connection.createStatement();
             } catch (SQLException ex) {
                 Logger.getLogger(SecurityFundamentalsAndDevelopmentProject.class.getName()).log(Level.SEVERE, null, ex);
             }

            // Execute the query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM patient");

            // Process the results
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc", "root", ""
            );

            // Example data to be inserted
            String firstName = "John";
            String lastName = "Doe";
            String gender = "Male";
            String dob = "1990-01-01";  // Assuming YYYY-MM-DD format
            String bloodType = "O+";
            String emergencyContactName = "Jane Doe";
            String emergencyContactRelationship = "Spouse";
            String emergencyContactNumber = "1234567890";
            String allergies = "None";
            String medicalCondition = "None";

            // Create a PreparedStatement for parameterized query
            String sql = "INSERT INTO patient (fname, sname, gender, dob, blood_type, " +
                    "emergency_contact_name, emergency_contact_relationship, emergency_contact_number, " +
                    "allergies, medical_condition) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set values for parameters
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, gender);
            preparedStatement.setString(4, dob);
            preparedStatement.setString(5, bloodType);
            preparedStatement.setString(6, emergencyContactName);
            preparedStatement.setString(7, emergencyContactRelationship);
            preparedStatement.setString(8, emergencyContactNumber);
            preparedStatement.setString(9, allergies);
            preparedStatement.setString(10, medicalCondition);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Record inserted successfully.");
            } else {
                System.out.println("Failed to insert record.");
            }

            // Close resources
            preparedStatement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }*/
    }
}


