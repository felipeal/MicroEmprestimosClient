/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servercommunication.Communicator;
import servercommunication.ServerException;

/**
 *
 * @author Giovani
 */
public class EntrepreneurGUI extends javax.swing.JFrame {
    
    private final Communicator communicator;
    private final WelcomeGUI welcomeGUI;
    private ArrayList<ArrayList<Object>> projects;

    /**
     * Creates new form EnterpreneurGUI
     * @param welcomeGUI
     * @param communicator
     * @param user
     */
    public EntrepreneurGUI(WelcomeGUI welcomeGUI, Communicator communicator, String user) {
        this.welcomeGUI = welcomeGUI;
        this.communicator = communicator;
        initComponents();
        jLabelLoggedAs.setText("Logged as ".concat(user));
        listProjects();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelLoggedAs = new javax.swing.JLabel();
        jButtonLogout = new javax.swing.JButton();
        jScrollPaneSearchResults = new javax.swing.JScrollPane();
        jTableSearchResults = new javax.swing.JTable();
        jTextFieldSearchParameter = new javax.swing.JTextField();
        jComboBoxSearchMode = new javax.swing.JComboBox();
        jLabelSearchMode = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jPanelSelectedProject = new javax.swing.JPanel();
        jScrollPaneProjectDescription = new javax.swing.JScrollPane();
        jTextAreaProjectDescription = new javax.swing.JTextArea();
        jLabelDistanceToGoal = new javax.swing.JLabel();
        jButtonWithdraw = new javax.swing.JButton();
        jLabelMonthlyFeesRemaining = new javax.swing.JLabel();
        jButtonPayMonth = new javax.swing.JButton();
        jTextFieldDistanceToGoal = new javax.swing.JTextField();
        jTextFieldMontlyFeesRemaining = new javax.swing.JTextField();
        jPanelRequestNewProject = new javax.swing.JPanel();
        jLabelProjectName = new javax.swing.JLabel();
        jTextFieldProjectName = new javax.swing.JTextField();
        jLabelTargetAmount = new javax.swing.JLabel();
        jTextFieldTargetAmount = new javax.swing.JTextField();
        jButtonNewRequest = new javax.swing.JButton();
        jLabelMinDonation = new javax.swing.JLabel();
        jTextFieldMinDonation = new javax.swing.JTextField();
        jLabelLimitDate = new javax.swing.JLabel();
        jTextFieldLimitDate = new javax.swing.JTextField();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPaneNewRequestDescription = new javax.swing.JScrollPane();
        jTextAreaNewRequestDescription = new javax.swing.JTextArea();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitulo.setText("MicroEmpréstimos");

        jLabelLoggedAs.setText("Logged as username");

        jButtonLogout.setText("Logout");
        jButtonLogout.setFocusPainted(false);
        jButtonLogout.setFocusable(false);
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jTableSearchResults.setAutoCreateRowSorter(true);
        jTableSearchResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", "", "", null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Project Title", "Entrepreneur", "Location", "Target", "Achieved", "Expires"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSearchResults.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableSearchResults.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableSearchResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSearchResultsMouseClicked(evt);
            }
        });
        jTableSearchResults.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTableSearchResultsPropertyChange(evt);
            }
        });
        jScrollPaneSearchResults.setViewportView(jTableSearchResults);
        if (jTableSearchResults.getColumnModel().getColumnCount() > 0) {
            jTableSearchResults.getColumnModel().getColumn(0).setResizable(false);
            jTableSearchResults.getColumnModel().getColumn(0).setPreferredWidth(22);
            jTableSearchResults.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableSearchResults.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTableSearchResults.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTableSearchResults.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTableSearchResults.getColumnModel().getColumn(5).setPreferredWidth(60);
            jTableSearchResults.getColumnModel().getColumn(6).setPreferredWidth(60);
        }

        jComboBoxSearchMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "My Past Projects", "Project Title", "Enterpreneur name", "Location", "Remaining amount", "Achieved amount", "Expiration date" }));
        jComboBoxSearchMode.setFocusable(false);

        jLabelSearchMode.setText("Search Mode:");

        jButtonSearch.setText("Search");
        jButtonSearch.setFocusPainted(false);
        jButtonSearch.setFocusable(false);
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jPanelSelectedProject.setBorder(javax.swing.BorderFactory.createTitledBorder("Selected Project"));

        jTextAreaProjectDescription.setEditable(false);
        jTextAreaProjectDescription.setColumns(20);
        jTextAreaProjectDescription.setRows(5);
        jScrollPaneProjectDescription.setViewportView(jTextAreaProjectDescription);

        jLabelDistanceToGoal.setText("Distance to Goal:");

        jButtonWithdraw.setText("Withdraw contributions!");
        jButtonWithdraw.setFocusPainted(false);
        jButtonWithdraw.setFocusable(false);
        jButtonWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWithdrawActionPerformed(evt);
            }
        });

        jLabelMonthlyFeesRemaining.setText("Monthly Fees Remaining:");

        jButtonPayMonth.setText("Pay monthly fee");
        jButtonPayMonth.setFocusPainted(false);
        jButtonPayMonth.setFocusable(false);
        jButtonPayMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPayMonthActionPerformed(evt);
            }
        });

        jTextFieldDistanceToGoal.setEnabled(false);

        jTextFieldMontlyFeesRemaining.setEnabled(false);

        javax.swing.GroupLayout jPanelSelectedProjectLayout = new javax.swing.GroupLayout(jPanelSelectedProject);
        jPanelSelectedProject.setLayout(jPanelSelectedProjectLayout);
        jPanelSelectedProjectLayout.setHorizontalGroup(
            jPanelSelectedProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectedProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSelectedProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneProjectDescription)
                    .addGroup(jPanelSelectedProjectLayout.createSequentialGroup()
                        .addGroup(jPanelSelectedProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDistanceToGoal)
                            .addComponent(jLabelMonthlyFeesRemaining))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSelectedProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDistanceToGoal)
                            .addComponent(jTextFieldMontlyFeesRemaining, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelSelectedProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPayMonth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelSelectedProjectLayout.setVerticalGroup(
            jPanelSelectedProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectedProjectLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanelSelectedProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDistanceToGoal)
                    .addComponent(jTextFieldDistanceToGoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonWithdraw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSelectedProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPayMonth)
                    .addComponent(jTextFieldMontlyFeesRemaining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMonthlyFeesRemaining))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneProjectDescription)
                .addContainerGap())
        );

        jPanelRequestNewProject.setBorder(javax.swing.BorderFactory.createTitledBorder("Request New Project"));

        jLabelProjectName.setText("Project Name:");

        jLabelTargetAmount.setText("Target Amount:");

        jButtonNewRequest.setText("New Request");
        jButtonNewRequest.setFocusPainted(false);
        jButtonNewRequest.setFocusable(false);
        jButtonNewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewRequestActionPerformed(evt);
            }
        });

        jLabelMinDonation.setText("Minimum Donation:");

        jLabelLimitDate.setText("Limit Date:");

        jLabelDescription.setText("Description:");

        jTextAreaNewRequestDescription.setColumns(20);
        jTextAreaNewRequestDescription.setRows(5);
        jScrollPaneNewRequestDescription.setViewportView(jTextAreaNewRequestDescription);

        javax.swing.GroupLayout jPanelRequestNewProjectLayout = new javax.swing.GroupLayout(jPanelRequestNewProject);
        jPanelRequestNewProject.setLayout(jPanelRequestNewProjectLayout);
        jPanelRequestNewProjectLayout.setHorizontalGroup(
            jPanelRequestNewProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRequestNewProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRequestNewProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDescription)
                    .addGroup(jPanelRequestNewProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelMinDonation)
                        .addComponent(jLabelTargetAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelProjectName, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelLimitDate, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jButtonNewRequest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRequestNewProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLimitDate)
                    .addComponent(jScrollPaneNewRequestDescription, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldProjectName)
                    .addComponent(jTextFieldTargetAmount)
                    .addComponent(jTextFieldMinDonation))
                .addContainerGap())
        );
        jPanelRequestNewProjectLayout.setVerticalGroup(
            jPanelRequestNewProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRequestNewProjectLayout.createSequentialGroup()
                .addGroup(jPanelRequestNewProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProjectName)
                    .addComponent(jTextFieldProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRequestNewProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTargetAmount)
                    .addComponent(jTextFieldTargetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRequestNewProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMinDonation)
                    .addComponent(jTextFieldMinDonation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRequestNewProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLimitDate)
                    .addComponent(jTextFieldLimitDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRequestNewProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRequestNewProjectLayout.createSequentialGroup()
                        .addComponent(jLabelDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNewRequest))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRequestNewProjectLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPaneNewRequestDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLoggedAs)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLogout))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPaneSearchResults, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSearchMode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSearchMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSearchParameter, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSearch)
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelRequestNewProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelSelectedProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelLoggedAs)
                    .addComponent(jButtonLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSearchMode)
                            .addComponent(jComboBoxSearchMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSearchParameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneSearchResults, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanelSelectedProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelRequestNewProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        this.welcomeGUI.setVisible(true);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
    listProjects();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTableSearchResultsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTableSearchResultsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableSearchResultsPropertyChange

    private void jButtonWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWithdrawActionPerformed
        try {
            if (communicator.withdraw((int)jTableSearchResults.getValueAt(jTableSearchResults.getSelectedRow(), 0)))
                JOptionPane.showMessageDialog(null, "Successfully withdrawed.");
        } catch (ServerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonWithdrawActionPerformed

    private void jButtonPayMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPayMonthActionPerformed
        // NOT YET IMPLEMENTED
    }//GEN-LAST:event_jButtonPayMonthActionPerformed

    private void jButtonNewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewRequestActionPerformed
        try {
            communicator.createProject(jTextFieldProjectName.getText(), jTextAreaNewRequestDescription.getText(), Float.parseFloat(jTextFieldMinDonation.getText()), Float.parseFloat(jTextFieldTargetAmount.getText()), jTextFieldLimitDate.getText());
            JOptionPane.showMessageDialog(null, "Request sent successfully!");
            jTextFieldProjectName.setText("");
            jTextAreaNewRequestDescription.setText("");
            jTextFieldMinDonation.setText("");
            jTextFieldTargetAmount.setText("");
            jTextFieldLimitDate.setText("");
        } catch (ServerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonNewRequestActionPerformed

    private void jTableSearchResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSearchResultsMouseClicked
        try {
            jTextAreaProjectDescription.setText(communicator.getProject((int)jTableSearchResults.getValueAt(jTableSearchResults.getSelectedRow(), 0)));
            float target = (float)jTableSearchResults.getValueAt(jTableSearchResults.getSelectedRow(), 4);
            float achieved = (float)jTableSearchResults.getValueAt(jTableSearchResults.getSelectedRow(), 5);
            if (target - achieved > 0) {
                jTextFieldDistanceToGoal.setText(String.valueOf(target-achieved));
            } else {
                jTextFieldDistanceToGoal.setText("0");
            }
            jTextFieldMontlyFeesRemaining.setText("XXX");
        } catch (ServerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jTableSearchResultsMouseClicked

    private void listProjects() {
        try {
            projects = communicator.searchProjects(jComboBoxSearchMode.getSelectedIndex(),jTextFieldSearchParameter.getText());
            // Get table
            DefaultTableModel dataModel = (DefaultTableModel) jTableSearchResults.getModel();
            // Clear table
            int rows = dataModel.getRowCount();
            for (int i = rows-1; i >= 0; i--)
                dataModel.removeRow(i);
            // Fill table
            for (ArrayList<Object> project : projects) {
                dataModel.addRow(project.toArray());
            }
        } catch (ServerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            // se não quer usar a interface como gente, morra motherfucker
            this.welcomeGUI.setVisible(true);
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonNewRequest;
    private javax.swing.JButton jButtonPayMonth;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonWithdraw;
    private javax.swing.JComboBox jComboBoxSearchMode;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelDistanceToGoal;
    private javax.swing.JLabel jLabelLimitDate;
    private javax.swing.JLabel jLabelLoggedAs;
    private javax.swing.JLabel jLabelMinDonation;
    private javax.swing.JLabel jLabelMonthlyFeesRemaining;
    private javax.swing.JLabel jLabelProjectName;
    private javax.swing.JLabel jLabelSearchMode;
    private javax.swing.JLabel jLabelTargetAmount;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelRequestNewProject;
    private javax.swing.JPanel jPanelSelectedProject;
    private javax.swing.JScrollPane jScrollPaneNewRequestDescription;
    private javax.swing.JScrollPane jScrollPaneProjectDescription;
    private javax.swing.JScrollPane jScrollPaneSearchResults;
    private javax.swing.JTable jTableSearchResults;
    private javax.swing.JTextArea jTextAreaNewRequestDescription;
    private javax.swing.JTextArea jTextAreaProjectDescription;
    private javax.swing.JTextField jTextFieldDistanceToGoal;
    private javax.swing.JTextField jTextFieldLimitDate;
    private javax.swing.JTextField jTextFieldMinDonation;
    private javax.swing.JTextField jTextFieldMontlyFeesRemaining;
    private javax.swing.JTextField jTextFieldProjectName;
    private javax.swing.JTextField jTextFieldSearchParameter;
    private javax.swing.JTextField jTextFieldTargetAmount;
    // End of variables declaration//GEN-END:variables
}
