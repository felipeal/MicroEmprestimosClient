/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servercommunication;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class RegisterUserCommunication {
    
    private PrintStream msgToServer;
    private Scanner msgFromServer;
    
    public RegisterUserCommunication(PrintStream msgToServer, Scanner msgFromServer) {
        this.msgToServer = msgToServer;
        this.msgFromServer = msgFromServer;
    }
    
    public void RegisterDonator(String login, String password, String name) throws ServerException {
        // Send function
        msgToServer.println("register");
        // Send role
        msgToServer.println("donator");
        
        // Check for exceptions
        if (msgFromServer.nextLine().equals("exception")) {
            throw new ServerException(msgFromServer.nextLine());
        }
        
        // Send login
        msgToServer.println(login);
        // Send password
        msgToServer.println(password);
        // Send name
        msgToServer.println(name);
        
        // Check for exceptions
        if (msgFromServer.nextLine().equals("exception")) {
            throw new ServerException(msgFromServer.nextLine());
        }
    }
    
    public void RegisterEntrepreneur(String login, String password, String name, String location) throws ServerException {
        // Send function
        msgToServer.println("register");
        // Send role
        msgToServer.println("entrepreneur");
        
        // Check for exceptions
        if (msgFromServer.nextLine().equals("exception")) {
            throw new ServerException(msgFromServer.nextLine());
        }
        
        // Send login
        msgToServer.println(login);
        // Send password
        msgToServer.println(password);
        // Send name
        msgToServer.println(name);
        // Send location
        msgToServer.println(location);
        
        // Check for exceptions
        if (msgFromServer.nextLine().equals("exception")) {
            throw new ServerException(msgFromServer.nextLine());
        }
    }
    
}
