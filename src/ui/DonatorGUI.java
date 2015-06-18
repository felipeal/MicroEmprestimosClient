/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servercommunication.Communicator;
import servercommunication.ServerException;

/**
 *
 * @author Giovani
 */
public class DonatorGUI extends javax.swing.JFrame {
	
    private final Communicator communicator;
    private final WelcomeGUI welcomeGUI;
    private ArrayList<ArrayList<Object>> projects;

    /**
     * Creates new form DonatorGUI
     * @param welcomeGUI
     * @param communicator
     * @param user
     * @param credits
     */
    public DonatorGUI(WelcomeGUI welcomeGUI, Communicator communicator, String user, String credits) {
        this.welcomeGUI = welcomeGUI;
        this.communicator = communicator;
        this.projects = null;
        initComponents();
        jLabelLoggedAs.setText("Logged as ".concat(user));
        jTextFieldCredits.setText(credits);
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

        jLabelTitulo = new javax.swing.JLabel();
        jLabelLoggedAs = new javax.swing.JLabel();
        jLabelCredits = new javax.swing.JLabel();
        jButtonGetCredits = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jTextFieldSearchParameter = new javax.swing.JTextField();
        jComboBoxSearchMode = new javax.swing.JComboBox();
        jLabelSearchMode = new javax.swing.JLabel();
        jScrollPaneSearchResults = new javax.swing.JScrollPane();
        jTableSearchResults = new javax.swing.JTable();
        jPanelSelectedProject = new javax.swing.JPanel();
        jScrollPaneProjectDescription = new javax.swing.JScrollPane();
        jTextAreaProjectDescription = new javax.swing.JTextArea();
        jLabelDonate = new javax.swing.JLabel();
        jTextFieldDonateAmount = new javax.swing.JTextField();
        jButtonDonate = new javax.swing.JButton();
        jTextFieldCredits = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitulo.setText("MicroEmprestimos");

        jLabelLoggedAs.setText("Logged as username");

        jLabelCredits.setText("Credits:");

        jButtonGetCredits.setText("Get credits");
        jButtonGetCredits.setFocusPainted(false);
        jButtonGetCredits.setFocusable(false);
        jButtonGetCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGetCreditsActionPerformed(evt);
            }
        });

        jButtonLogout.setText("Logout");
        jButtonLogout.setFocusPainted(false);
        jButtonLogout.setFocusable(false);
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Search");
        jButtonSearch.setFocusPainted(false);
        jButtonSearch.setFocusable(false);
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jComboBoxSearchMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "My Donations", "Project Title", "Enterpreneur name", "Location", "Remaining amount", "Achieved amount", "Expiration date" }));
        jComboBoxSearchMode.setFocusable(false);

        jLabelSearchMode.setText("Search Mode:");

        jTableSearchResults.setAutoCreateRowSorter(true);
        jTableSearchResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", "", "", null, null, null},
                {null, "", "", "", null, null, null},
                {null, "", "", "", null, null, null},
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
        jTableSearchResults.setColumnSelectionAllowed(true);
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
        jTableSearchResults.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        jPanelSelectedProject.setBorder(javax.swing.BorderFactory.createTitledBorder("Selected Project"));
        jPanelSelectedProject.setToolTipText("");

        jTextAreaProjectDescription.setEditable(false);
        jTextAreaProjectDescription.setColumns(20);
        jTextAreaProjectDescription.setRows(5);
        jScrollPaneProjectDescription.setViewportView(jTextAreaProjectDescription);

        jLabelDonate.setText("Donate amount:");

        jButtonDonate.setText("Donate to this project!");
        jButtonDonate.setFocusPainted(false);
        jButtonDonate.setFocusable(false);
        jButtonDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDonateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSelectedProjectLayout = new javax.swing.GroupLayout(jPanelSelectedProject);
        jPanelSelectedProject.setLayout(jPanelSelectedProjectLayout);
        jPanelSelectedProjectLayout.setHorizontalGroup(
            jPanelSelectedProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectedProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSelectedProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSelectedProjectLayout.createSequentialGroup()
                        .addComponent(jLabelDonate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDonateAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDonate, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                    .addComponent(jScrollPaneProjectDescription))
                .addContainerGap())
        );
        jPanelSelectedProjectLayout.setVerticalGroup(
            jPanelSelectedProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectedProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSelectedProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDonate)
                    .addComponent(jTextFieldDonateAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDonate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneProjectDescription)
                .addContainerGap())
        );

        jTextFieldCredits.setEditable(false);
        jTextFieldCredits.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSearchMode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSearchMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSearchParameter, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearch))
                    .addComponent(jScrollPaneSearchResults, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelCredits)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGetCredits)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLoggedAs)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLogout))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelSelectedProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelLoggedAs)
                    .addComponent(jButtonLogout)
                    .addComponent(jLabelCredits)
                    .addComponent(jTextFieldCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGetCredits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxSearchMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSearchMode)
                            .addComponent(jButtonSearch)
                            .addComponent(jTextFieldSearchParameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneSearchResults, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
                    .addComponent(jPanelSelectedProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
//		try {
//				// TODO add your handling code here: PEDIR PROJECT E PRINTAR NA ÁREA DE TEXTO
//				if (jListSearchResults.getSelectedIndex() == -1)
//					jTextAreaProjectDescription.setText("Selected project description");
//				else
//					jTextAreaProjectDescription.setText(communicator.getProject(projects.get(jListSearchResults.getSelectedIndex()).getValue()));
//			} catch (ServerException ex) {
//				JOptionPane.showMessageDialog(null, ex.getMessage());
//			}
    }//GEN-LAST:event_jTableSearchResultsPropertyChange

    private void jButtonDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDonateActionPerformed
        // TODO add your handling code here: POPUP DE CONFIRMAÇÃO => MANDAR DADOS PRA DONATE; ATUALIZAR CRÉDITOS SE TEVE SUCESSO
        switch (JOptionPane.showConfirmDialog(null, "Donating " + jTextFieldDonateAmount.getText() + 
                                                    " to project " + jTableSearchResults.getValueAt(jTableSearchResults.getSelectedRow(), 1) + 
                                                    ".\nConfirm?", "Confirm Donation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
            case JOptionPane.YES_OPTION:
                try {
                    jTextFieldCredits.setText(communicator.donateToProject((int)jTableSearchResults.getValueAt(jTableSearchResults.getSelectedRow(), 0), Float.parseFloat(jTextFieldDonateAmount.getText())));
                    jTextAreaProjectDescription.setText(communicator.getProject((int)jTableSearchResults.getValueAt(jTableSearchResults.getSelectedRow(), 0)));
                } catch (ServerException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
        }
    }//GEN-LAST:event_jButtonDonateActionPerformed

    private void jButtonGetCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGetCreditsActionPerformed
		try {
			Float creds = Float.parseFloat(JOptionPane.showInputDialog(rootPane, "Define the size of purchase", "Credits Purchase", JOptionPane.INFORMATION_MESSAGE, null, null, "").toString());
			communicator.buyCredits(creds);
			creds += Float.parseFloat(jTextFieldCredits.getText());
			jTextFieldCredits.setText(creds.toString());
		} catch (NumberFormatException nfex) {
			JOptionPane.showMessageDialog(null, "You must type a proper number", "Input Error", JOptionPane.ERROR_MESSAGE);
		} catch (ServerException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
    }//GEN-LAST:event_jButtonGetCreditsActionPerformed

    private void jTableSearchResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSearchResultsMouseClicked
        try {
            jTextAreaProjectDescription.setText(communicator.getProject((int)jTableSearchResults.getValueAt(jTableSearchResults.getSelectedRow(), 0)));
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
            for (ArrayList<Object> projectDetails : projects) {
                dataModel.addRow(projectDetails.toArray());
            }
        } catch (ServerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            // se não quer usar a interface como gente, morra motherfucker
            this.welcomeGUI.setVisible(true);
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDonate;
    private javax.swing.JButton jButtonGetCredits;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox jComboBoxSearchMode;
    private javax.swing.JLabel jLabelCredits;
    private javax.swing.JLabel jLabelDonate;
    private javax.swing.JLabel jLabelLoggedAs;
    private javax.swing.JLabel jLabelSearchMode;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelSelectedProject;
    private javax.swing.JScrollPane jScrollPaneProjectDescription;
    private javax.swing.JScrollPane jScrollPaneSearchResults;
    private javax.swing.JTable jTableSearchResults;
    private javax.swing.JTextArea jTextAreaProjectDescription;
    private javax.swing.JTextField jTextFieldCredits;
    private javax.swing.JTextField jTextFieldDonateAmount;
    private javax.swing.JTextField jTextFieldSearchParameter;
    // End of variables declaration//GEN-END:variables
}
