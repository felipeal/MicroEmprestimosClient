/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servercommunication;

import java.awt.List;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
    
    class Pair {
        
        public String title;
        public int id;
        
        private Pair(String title, int id) {
            this.title = title;
            this.id = id;
        }
    }
    
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
        try {
            server = new Socket(this.host, this.port);
        } catch (IOException e) {
            System.out.println("Couldn't connect to external server: " + e.getMessage());
            System.out.println("Trying to connect to local server.");
            server = new Socket(InetAddress.getLocalHost().getHostAddress(), this.port);
        }
        msgToServer = new PrintStream(this.server.getOutputStream());
        msgFromServer = new Scanner(this.server.getInputStream());
        System.out.println("The client has connected to the server!");
    }
    
    public void close() throws IOException {
        server.close();
    }
    
    public String login(String username, String password) throws ServerException {
        msgToServer.println("login");
        msgToServer.println(username);
        msgToServer.println(password);
        
        if (msgFromServer.nextLine().equals("exception"))
            throw new ServerException(msgFromServer.nextLine());
        
        return msgFromServer.nextLine(); // Returns the credit amount
    }
    
    public ArrayList searchProjects(int mode, String value) throws ServerException {
        ArrayList result = new ArrayList();
        
        msgToServer.println("search");
        
        if (searchStrings.containsKey(mode))
            msgToServer.println(searchStrings.get(mode));
        else
            msgToServer.println("cancel");
        
        msgToServer.println(value);
        
        String stringId = msgFromServer.nextLine();
        if (stringId.equals("exception"))
            throw new ServerException(msgFromServer.nextLine());
        
        while (!stringId.equals("-1")) {
            result.add(new Pair(msgFromServer.nextLine(), Integer.parseInt(stringId)));
            //System.out.println(stringId + ": " + msgFromServer.nextLine());
            
            stringId = msgFromServer.nextLine();
        }
        
        return result;
    }
    
    public String getProject(int projectId) throws ServerException {
        msgToServer.println("getProject");
        msgToServer.println(projectId);
        
        if (msgFromServer.nextLine().equals("exception"))
            throw new ServerException(msgFromServer.nextLine());
        
        StringBuffer bf = new StringBuffer();
        bf.append("Title: ").append(msgFromServer.nextLine()).append("\nBy: ").append(msgFromServer.nextLine());
        bf.append("\n\n").append(msgFromServer.nextLine());
        bf.append("\n\nMinimum donation: ").append(msgFromServer.nextLine()).append("\nDonated amount: ").append(msgFromServer.nextLine());
        bf.append("\nTarget value: ").append(msgFromServer.nextLine()).append("\n\nLimit date: ").append(msgFromServer.nextLine());
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
