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
public class RegisterUserCommunication extends AbstractCommunication {
    
    public RegisterUserCommunication(PrintStream msgToServer, Scanner msgFromServer) {
        super(msgToServer, msgFromServer);
    }
    
    /**
     * Communicates with the server to register a new donator.
     * @param login
     * @param password
     * @param name
     * @throws ServerException 
     */
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
    
    /**
     * Communicates with the server to register a new entrepreneur.
     * @param login
     * @param password
     * @param name
     * @param location
     * @throws ServerException 
     */
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
