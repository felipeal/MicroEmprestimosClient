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
public class CreateProjectCommunication extends AbstractCommunication {
    
    public CreateProjectCommunication(PrintStream msgToServer, Scanner msgFromServer) {
        super(msgToServer, msgFromServer);
    }
    
    /**
     * Communicates with the server to create a new project.
     * @param title
     * @param description
     * @param minDonationValue
     * @param target
     * @param limitDate
     * @throws ServerException 
     */
    public void createProject(String title, String description, float minDonationValue, float target, String limitDate) throws ServerException {
        // Send the function
        msgToServer.println("createProject");
        
        // Check for exceptions
        if (msgFromServer.nextLine().equals("exception")) {
            throw new ServerException(msgFromServer.nextLine());
        }
        
        // Send title
        msgToServer.println(title);
        // Send description
        msgToServer.println(description);
        // Send minimun donation value
        msgToServer.println(minDonationValue);
        // Send target value
        msgToServer.println(target);
        // Send limit date
        msgToServer.println(limitDate);
    }
}
