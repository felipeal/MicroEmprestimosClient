/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servercommunication;

import java.io.IOException;
import java.io.InputStream;
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
    
    public Map<Integer,String> searchProjects(int mode, String value) throws IOException {
        Map<Integer, String> result = new HashMap<>();
        
        PrintStream msgToServer = new PrintStream(this.server.getOutputStream());
        msgToServer.println("search");
        
        switch (mode) {
            case 0://TROCAR PARA ENUM TITLE
                msgToServer.println("title");
                break;
            
            default:
                msgToServer.println("cancel");
                return result;
        }
        
        msgToServer.println(value);
        
        Scanner msgFromServer = new Scanner(this.server.getInputStream());
        String stringId = msgFromServer.nextLine();
        while (!stringId.equals("-1")) {
            //result.put(Integer.parseInt(stringId), msgFromServer.nextLine());
            System.out.println(stringId + ": " + msgFromServer.nextLine());
            
            stringId = msgFromServer.nextLine();
        }
        
        return result;
    }
}
