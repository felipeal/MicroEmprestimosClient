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
    private String host;
    private int port;
    private Socket server;
    
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
        System.out.println("The client has connected to the server!");
    }
    
    public void close() throws IOException {
        server.close();
    }
    
    public void login(String username, String password) throws IOException, ServerException {
        PrintStream msgToServer = new PrintStream(this.server.getOutputStream());
        
        msgToServer.println("login");
        msgToServer.println(username);
        msgToServer.println(password);
        
        Scanner msgFromServer = new Scanner(this.server.getInputStream());
        
        if (msgFromServer.nextLine().equals("exception"))
            throw new ServerException(msgFromServer.nextLine());
    }
    
    public Map<Integer,String> searchProjects(Mode mode, String value) throws IOException, ServerException {
        Map<Integer, String> result = new HashMap<>();
        
        PrintStream msgToServer = new PrintStream(this.server.getOutputStream());
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
        
        Scanner msgFromServer = new Scanner(this.server.getInputStream());
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
    
    public void donateToProject(int projectId, float amount) throws IOException, ServerException {
        PrintStream msgToServer = new PrintStream(this.server.getOutputStream());
        
        msgToServer.println("donate");
        msgToServer.println(projectId);
        msgToServer.println(amount);
        
        Scanner msgFromServer = new Scanner(this.server.getInputStream());
        
        if (msgFromServer.nextLine().equals("exception")) {
            throw new ServerException(msgFromServer.nextLine());
        }
    }
}
