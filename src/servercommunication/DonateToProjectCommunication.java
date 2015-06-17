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
public class DonateToProjectCommunication extends AbstractCommunication {
    
    public DonateToProjectCommunication(PrintStream msgToServer, Scanner msgFromServer) {
        super(msgToServer, msgFromServer);
    }
    
    public String donateToProject(int projectId, float amount) throws ServerException {
        // Send donate function
        msgToServer.println("donate");
        
        // Check exceptions
        if (msgFromServer.nextLine().equals("exception")) {
            throw new ServerException(msgFromServer.nextLine());
        }
        
        // Send the project id
        msgToServer.println(projectId);
        // Send the donation amount
        msgToServer.println(amount);
        
        // Check exceptions
        if (msgFromServer.nextLine().equals("exception"))
            throw new ServerException(msgFromServer.nextLine());
        
        // Return client's new balance
        return msgFromServer.nextLine();
    }
}
