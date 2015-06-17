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
import java.util.Scanner;
import javafx.util.Pair;

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
    
    public Communicator (String host, int port) {
        this.host = host;
        this.port = port;
    }
    
    public void execute() throws IOException {
//        try {
//            server = new Socket(this.host, this.port);
//        } catch (IOException e) {
//            System.out.println("Couldn't connect to external server: " + e.getMessage());
//            System.out.println("Trying to connect to local server.");
            server = new Socket(InetAddress.getLocalHost().getHostAddress(), this.port);
//        }
        msgToServer = new PrintStream(this.server.getOutputStream());
        msgFromServer = new Scanner(this.server.getInputStream());
        System.out.println("The client has connected to the server!");
    }
    
    public void close() throws IOException {
        server.close();
    }
    
    public void buyCredits(float amount) throws ServerException {
        new BuyCreditsCommunication(msgToServer, msgFromServer).buyCredits(amount);
    }
    
    public void createProject(String title, String description, float minDonationValue, float target, String limitDate) throws ServerException {
        new CreateProjectCommunication(msgToServer, msgFromServer).createProject(title, description, minDonationValue, target, limitDate);
    }
    
    /**
     * 
     * @param projectId
     * @param amount
     * @return the client's balance after the donation
     * @throws ServerException 
     */
    public String donateToProject(int projectId, float amount) throws ServerException {
        return new DonateToProjectCommunication(msgToServer, msgFromServer).donateToProject(projectId, amount);
    }
    
    public ArrayList<Pair<String,Integer>> getOwnedProjects() throws ServerException {
        return new SearchProjectCommunication(msgToServer, msgFromServer).getOwnedProjects();
    }
    
    public String getProject(int projectId) throws ServerException {
        return new SearchProjectCommunication(msgToServer, msgFromServer).getProject(projectId);
    }
    
//    public AdminLoginReturn loginDonator(String username, String password) throws ServerException {
//        
//    }
    /**
     * 
     * @param username
     * @param password
     * @return a pair containing the name and the balance amount of the donator
     * @throws ServerException 
     */
    public Pair<String,Float> loginDonator(String username, String password) throws ServerException {
        return new LoginCommunication(msgToServer, msgFromServer).loginDonator(username, password);
    }
    /**
     * 
     * @param username
     * @param password
     * @return a pair containing the name and the location of the entrepreneur
     * @throws ServerException 
     */
    public Pair<String,String> loginEntrepreneur(String username, String password) throws ServerException {
        return new LoginCommunication(msgToServer, msgFromServer).loginEntrepreneur(username, password);
    }
    
    public void registerDonator(String username, String password, String name) throws ServerException {
        new RegisterUserCommunication(msgToServer, msgFromServer).RegisterDonator(username, password, name);
    }
    public void registerEntrepreneur(String username, String password, String name, String location) throws ServerException {
        new RegisterUserCommunication(msgToServer, msgFromServer).RegisterEntrepreneur(username, password, name, location);
    }
    
    /**
     * 
     * @param mode
     * @param value
     * @return a list containing pairs that contain the title and the id of the project
     * @throws ServerException 
     */
    public ArrayList<Pair<String,Integer>> searchProjects(int mode, String value) throws ServerException {
        return new SearchProjectCommunication(msgToServer, msgFromServer).searchProjects(mode, value);
    }
    
    public void withdraw(int projectId) throws ServerException {
        new WithdrawCommunication(msgToServer, msgFromServer).withdraw(projectId);
    }
}
