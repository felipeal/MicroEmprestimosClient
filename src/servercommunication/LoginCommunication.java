/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servercommunication;

import java.io.PrintStream;
import java.util.Scanner;
import javafx.util.Pair;

/**
 *
 * @author Igor
 */
public class LoginCommunication {
    
    private final PrintStream msgToServer;
    private final Scanner msgFromServer;
    
    public LoginCommunication(PrintStream msgToServer, Scanner msgFromServer) {
        this.msgToServer = msgToServer;
        this.msgFromServer = msgFromServer;
    }
    
    public Pair<String,Float> loginDonator(String username, String password) throws ServerException {
        // Send the login message
        msgToServer.println("login");
        // Send the role
        msgToServer.println("donator");
        // Try to login
        login(username, password); // Throws an exception if it goes wrong
        
        // Receive donator's name
        String name = msgFromServer.nextLine();
        // Receive donator's amount
        float amount = Float.parseFloat(msgFromServer.nextLine());
        
        Pair<String,Float> returnVariable = new Pair<>(name, amount);
        return returnVariable;
    }
    
    public Pair<String,String> loginEntrepreneur(String username, String password) throws ServerException {
        // Send the login message
        msgToServer.println("login");
        // Send the role
        msgToServer.println("entrepreneur");
        // Try to login
        login(username, password); // Throws an exception if it goes wrong
        
        // Receive entrepreneur's name
        String name = msgFromServer.nextLine();
        // Receive entrepreneur's location
        String location = msgFromServer.nextLine();
        
        Pair<String,String> returnVariable = new Pair<>(name, location);
        return returnVariable;
    }
    
    private void login(String username, String password) throws ServerException {
        // Send the username
        msgToServer.println(username);
        // Send the password
        msgToServer.println(password);
        
        String message =  msgFromServer.nextLine();
        System.out.println(message);
        if (message.equals("exception"))
            throw new ServerException(msgFromServer.nextLine());
    }
    
}
