/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servercommunication;

import java.awt.List;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.util.Pair;

/**
 *
 * @author Igor
 */
public class SearchProjectCommunication extends AbstractCommunication {
    
    private final Map<Integer,String> searchStrings;
    
    public SearchProjectCommunication(PrintStream msgToServer, Scanner msgFromServer) {
        super(msgToServer, msgFromServer);
        
        searchStrings = new HashMap<>();
        searchStrings.put(0, "owned");
        searchStrings.put(1, "title");
        searchStrings.put(2, "entrepreneurName");
        searchStrings.put(3, "locale");
        searchStrings.put(4, "remainingAmount");
        searchStrings.put(5, "achievedAmount");
        searchStrings.put(6, "expirationDate");
    }
    
    /**
     * Communicates with the server to make a project search.
     * @param mode
     * @param value
     * @return the list of result projects
     * @throws ServerException 
     */
    public ArrayList<ArrayList<Object>> searchProjects(int mode, String value) throws ServerException {
        ArrayList<ArrayList<Object>> result = new ArrayList<>();
        
        // Send the search message
        msgToServer.println("search");
        
        System.out.println("Search function: " + mode);
        
        // Check for exceptions
        if (msgFromServer.nextLine().equals("exception")) {
            throw new ServerException(msgFromServer.nextLine());
        }
        
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
        System.out.println(stringId);
        
        // When the id is equals end all results have been received
        while (!stringId.equals("end")) {
            ArrayList<Object> data = new ArrayList<Object>();
            data.add(0, Integer.parseInt(stringId));
            
            // Receive the title of the project
            String title = msgFromServer.nextLine();
            data.add(1, title);
            // Receive the project owner's name
            String entrepreneur = msgFromServer.nextLine();
            data.add(2, entrepreneur);
            // Receive the project location
            String location = msgFromServer.nextLine();
            data.add(3, location);
            // Receive project target value
            float target = Float.parseFloat(msgFromServer.nextLine());
            data.add(4, target);
            // Receive achieved amount
            float achieved = Float.parseFloat(msgFromServer.nextLine());
            data.add(5, achieved);
            // Receive expiration date
            String date = msgFromServer.nextLine();
            data.add(6, date);
            
            // Add the pair to the result list
            result.add(data);
            // Receive the next id
            stringId = msgFromServer.nextLine();
        }
        System.out.println("Search finished");
        
        // Return the list of pairs
        return result;
    }
    
    /**
     * Communicates with the server to get information about the project with the given id.
     * @param projectId
     * @return a String containing information about the project
     * @throws ServerException 
     */
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
}
