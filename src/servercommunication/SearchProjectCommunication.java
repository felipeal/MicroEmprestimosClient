/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servercommunication;

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
public class SearchProjectCommunication {
    
    private final PrintStream msgToServer;
    private final Scanner msgFromServer;
    
    private final Map<Integer,String> searchStrings;
    
    public SearchProjectCommunication(PrintStream msgToServer, Scanner msgFromServer) {
        this.msgToServer = msgToServer;
        this.msgFromServer = msgFromServer;
        
        searchStrings = new HashMap<>();
        searchStrings.put(0, "suggestions");
        searchStrings.put(1, "title");
        searchStrings.put(2, "enterpreneurName");
        searchStrings.put(3, "locale");
        searchStrings.put(4, "remainingAmount");
        searchStrings.put(5, "achievedAmount");
        searchStrings.put(6, "expirationDate");
    }
    
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
}
