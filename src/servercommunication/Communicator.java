/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servercommunication;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.util.Pair;

/**
 *
 * @author Igor
 */
public class Communicator {
    private final String host;
    private final int port;
    private Socket server;
    private PrintStream msgToServer;
    private Scanner msgFromServer;
    
    private Map<Integer,String> searchStrings;
    
    public Communicator (String host, int port) {
        this.host = host;
        this.port = port;
        
        searchStrings = new HashMap<>();
        searchStrings.put(0, "sujestions");
        searchStrings.put(1, "title");
        searchStrings.put(2, "enterpreneurName");
        searchStrings.put(3, "locale");
        searchStrings.put(4, "remainingAmount");
        searchStrings.put(5, "achievedAmount");
        searchStrings.put(6, "expirationDate");
    }
    
    public void execute() throws IOException {
//        try {
//            server = new Socket(this.host, this.port);
//        } catch (IOException e) {
//            System.out.println("Couldn't connect to external server: " + e.getMessage());
//            System.out.println("Trying to connect to local server.");
            server = new Socket(InetAddress.getLocalHost().getHostAddress(), this.port);
//        }
        msgToServer = new PrintStream(this.server.getOutputStream());
        msgFromServer = new Scanner(this.server.getInputStream());
        System.out.println("The client has connected to the server!");
    }
    
    public void close() throws IOException {
        server.close();
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
    
//    public AdminLoginReturn loginDonator(String username, String password) throws ServerException {
//        
//    }
    /**
     * 
     * @param username
     * @param password
     * @return a pair containing the name and the balance amount of the donator
     * @throws ServerException 
     */
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
    /**
     * 
     * @param username
     * @param password
     * @return a pair containing the name and the location of the entrepreneur
     * @throws ServerException 
     */
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
    
    /**
     * 
     * @param mode
     * @param value
     * @return a list containing pairs that contain the title and the id of the project
     * @throws ServerException 
     */
    public ArrayList<Pair<String,Integer>> searchProjects(int mode, String value) throws ServerException {
        ArrayList<Pair<String,Integer>> result = new ArrayList<>();
        
        // Send the search message
        msgToServer.println("search");
        
        // If the map searchStrings contains this mode of search, send the mode to the server
        if (searchStrings.containsKey(mode))
            // Send the search mode
            msgToServer.println(searchStrings.get(mode));
        else {
            // Send a cancel message and end the function
            msgToServer.println("cancel");
            throw new ServerException("No such function.");
        }
        // Check for exceptions
        if (msgFromServer.nextLine().equals("exception")) {
            throw new ServerException(msgFromServer.nextLine());
        }
        
        // Send the search value
        msgToServer.println(value);
        
        // Receive the id of the first project
        String stringId = msgFromServer.nextLine();
        
        // When the id is equals -1 all results have been received
        while (!stringId.equals("-1")) {
            // Receive the title of the project
            String title = msgFromServer.nextLine();
            // Add the pair to the result list
            result.add(new Pair<>(title, Integer.parseInt(stringId)));
            // Receive the next id
            stringId = msgFromServer.nextLine();
        }
        
        // Return the list of pairs
        return result;
    }
    
    public String getProject(int projectId) throws ServerException {
        // Send the getProject action
        msgToServer.println("getProject");
        // Send the project id
        msgToServer.println(projectId);
        
        // Check for exceptions
        if (msgFromServer.nextLine().equals("exception"))
            throw new ServerException(msgFromServer.nextLine());
        
        StringBuffer bf = new StringBuffer();
        // Receive the title and the entrepreneur's name
        bf.append("Title: ").append(msgFromServer.nextLine()).append("\nBy: ").append(msgFromServer.nextLine());
        // Receive the description
        bf.append("\n\n").append(msgFromServer.nextLine());
        // Receive the minimum donation amount and the donated amount
        bf.append("\n\nMinimum donation: ").append(msgFromServer.nextLine()).append("\nDonated amount: ").append(msgFromServer.nextLine());
        // Receive the target value and the limit date
        bf.append("\nTarget value: ").append(msgFromServer.nextLine()).append("\n\nLimit date: ").append(msgFromServer.nextLine());
        // Return the created string
        return new String(bf);
    }
    
    public String donateToProject(int projectId, float amount) throws ServerException {
        msgToServer.println("donate");
        msgToServer.println(projectId);
        msgToServer.println(amount);
        
        if (msgFromServer.nextLine().equals("exception"))
            throw new ServerException(msgFromServer.nextLine());
        
        return msgFromServer.nextLine();
    }
}
