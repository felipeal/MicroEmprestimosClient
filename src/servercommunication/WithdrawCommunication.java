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
public class WithdrawCommunication extends AbstractCommunication {
    
    public WithdrawCommunication(PrintStream msgToServer, Scanner msgFromServer) {
        super(msgToServer, msgFromServer);
    }
    
    /**
     * Communicates with the server to withdraw the money from the project.
     * @param projectId
     * @throws ServerException 
     */
    public boolean withdraw(int projectId) throws ServerException {
        // Send the function
        msgToServer.println("withdraw");
        // Check exceptions
        if (msgFromServer.nextLine().equals("exception")) {
            throw new ServerException(msgFromServer.nextLine());
        }
        
        // Send the project id
        msgToServer.println(projectId);
        
        // Check exceptions
        if (msgFromServer.nextLine().equals("exception")) {
            throw new ServerException(msgFromServer.nextLine());
        }
        return true;
    }
    
}
