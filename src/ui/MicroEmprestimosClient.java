/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;
import servercommunication.Communicator;

/**
 *
 * @author Igor
 */
public class MicroEmprestimosClient {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Communicator communicator = new Communicator("177.134.36.246", 17592);
        communicator.execute();
        
        new WelcomeGUI(communicator).setVisible(true);
        
    }
}
