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
    
    public enum Mode {
        TITLE,
        ENTERPRENEUR_NAME,
        DESCRIPTION,
        REMAINING_AMOUNT,
        ACHIEVED_AMOUNT,
        EXPIRATION;
    }
    
    public Communicator (String host, int port) {
        this.host = host;
        this.port = port;
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
    
    public Map<Integer,String> searchProjects(Mode mode, String value) throws ServerException {
        Map<Integer, String> result = new HashMap<>();
        
        msgToServer.println("search");
        
        switch (mode) {
            case TITLE:
                msgToServer.println("title");
                break;
               
            case ENTERPRENEUR_NAME:
                msgToServer.println("enterpreneurName");
                break;
                
            case DESCRIPTION:
                msgToServer.println("description");
                break;
            
            case REMAINING_AMOUNT:
                msgToServer.println("remainingAmount");
                break;
                
            case ACHIEVED_AMOUNT:
                msgToServer.println("achievedAmount");
                break;
                
            case EXPIRATION:
                msgToServer.println("expirationDate");
                break;
            
            default:
                msgToServer.println("cancel");
                return result;
        }
        
        msgToServer.println(value);
        
        String stringId = msgFromServer.nextLine();
        if (stringId.equals("exception"))
            throw new ServerException(msgFromServer.nextLine());
        
        while (!stringId.equals("-1")) {
            //result.put(Integer.parseInt(stringId), msgFromServer.nextLine());
            System.out.println(stringId + ": " + msgFromServer.nextLine());
            
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
