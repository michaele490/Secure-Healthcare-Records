/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.healthcarerecordsserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class HealthcareRecordsServer {

    private static ServerSocket servSock;
    private static final int PORT = 1234;
    private static int clientConnections = 0;
    private static ArrayList<HealthcareRecord> scheduleArray;
    private static String clientinput;
    private static String addResponse;
    private static String removeResponse;
    

    public static void main(String[] args) {
        scheduleArray = new ArrayList<>(); 
        System.out.println("Opening port...\n");
        try {
            servSock = new ServerSocket(PORT);      //Step 1.
        } catch (IOException e) {
            System.out.println("Unable to attach to port!");
            System.exit(1);
        }

        do {
            run();
        } while (true);

    }




    
    private static void run() {
    Socket link = null;                        //Step 2.
    try 
    {
        link = servSock.accept(); 
        clientConnections++;
        String client_ID = "Client "+ clientConnections;
        Runnable resource = new ClientConnectionRun(link, client_ID);
        Thread t = new Thread (resource);
        t.start();
    }
    catch(IOException e1)
    {
        e1.printStackTrace();
        try {
	    System.out.println("\n* Closing connection... *");
            link.close();				    //Step 5.
	}
       catch(IOException e2)
       {
            System.out.println("Unable to disconnect!");
	    System.exit(1);
       }
    }
    }
}
