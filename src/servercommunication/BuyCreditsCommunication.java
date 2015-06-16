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
public class BuyCreditsCommunication {
    
    private PrintStream msgToServer;
    private Scanner msgFromServer;
    
    public BuyCreditsCommunication(PrintStream msgToServer, Scanner msgFromServer) {
        this.msgToServer = msgToServer;
        this.msgFromServer = msgFromServer;
    }
    
    public void buyCredits(float amount) throws ServerException {
        // Send function
        msgToServer.println("buyCredits");
        
        // Check for exceptions
        if (msgFromServer.nextLine().equals("exception")) {
            throw new ServerException(msgFromServer.nextLine());
        }
        
        // Send amount
        msgToServer.println(amount);
    }
    
}
