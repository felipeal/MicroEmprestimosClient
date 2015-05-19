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
        //communicator.execute();
		
		// Set Windows look and feel
        try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(WelcomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		// Create and display the application window
        java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
			new WelcomeGUI(communicator).setVisible(true);
			}
		});
        
    }
}
