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
import servercommunication.Communicator;
import servercommunication.Communicator.Pair;
import servercommunication.ServerException;

/**
 *
 * @author Giovani
 */
public class DonatorGUI extends javax.swing.JFrame {
	
	private final Communicator communicator;
        private ArrayList<Communicator.Pair> projects;
	
	/**
	 * Creates new form DonorGUI
	 * @param communicator
	 * @param user
	 * @param credits
	 */
	public DonatorGUI(Communicator communicator, String user, String credits) {
		this.communicator = communicator;
		initComponents();
		jLabelLoggedAs.setText("Logged as ".concat(user));
		jLabelCredits.setText("Credits: ".concat(credits));
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
        jScrollPaneProjectDescription = new javax.swing.JScrollPane();
        jTextAreaProjectDescription = new javax.swing.JTextArea();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelSearch = new javax.swing.JPanel();
        jScrollPaneSearchResults = new javax.swing.JScrollPane();
        jListSearchResults = new javax.swing.JList();
        jTextFieldSearchParameter = new javax.swing.JTextField();
        jComboBoxSearchMode = new javax.swing.JComboBox();
        jLabelSearchMode = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jPanelDonateHistory = new javax.swing.JPanel();
        jScrollPaneDonateHistory = new javax.swing.JScrollPane();
        jListDonateHistory = new javax.swing.JList();
        jLabelDonate = new javax.swing.JLabel();
        jButtonDonate = new javax.swing.JButton();
        jTextFieldDonateAmount = new javax.swing.JTextField();
        jButtonLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitulo.setText("MicroEmprestimos");

        jLabelLoggedAs.setText("Logged as FulanoNomeComprido");

        jLabelCredits.setText("Credits: nnnn");

        jButtonGetCredits.setText("Get credits");

        jTextAreaProjectDescription.setColumns(20);
        jTextAreaProjectDescription.setRows(5);
        jTextAreaProjectDescription.setText("Selected project description");
        jScrollPaneProjectDescription.setViewportView(jTextAreaProjectDescription);

        jListSearchResults.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Suggestion 1", "Suggestion 2" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListSearchResults.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListSearchResults.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListSearchResultsValueChanged(evt);
            }
        });
        jScrollPaneSearchResults.setViewportView(jListSearchResults);

        jTextFieldSearchParameter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSearchParameterKeyTyped(evt);
            }
        });

        jComboBoxSearchMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suggestions", "Project Title", "Enterpreneur name", "Locale", "Remaining amount", "Achieved amount", "Expiration date" }));

        jLabelSearchMode.setText("Search Mode:");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSearchLayout = new javax.swing.GroupLayout(jPanelSearch);
        jPanelSearch.setLayout(jPanelSearchLayout);
        jPanelSearchLayout.setHorizontalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneSearchResults)
                    .addComponent(jTextFieldSearchParameter, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchLayout.createSequentialGroup()
                        .addComponent(jLabelSearchMode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSearchMode, 0, 174, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSearch)))
                .addContainerGap())
        );
        jPanelSearchLayout.setVerticalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSearchMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSearchMode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSearchParameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneSearchResults, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Projects Search", jPanelSearch);

        jListDonateHistory.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Project 1", "Project 2" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneDonateHistory.setViewportView(jListDonateHistory);

        javax.swing.GroupLayout jPanelDonateHistoryLayout = new javax.swing.GroupLayout(jPanelDonateHistory);
        jPanelDonateHistory.setLayout(jPanelDonateHistoryLayout);
        jPanelDonateHistoryLayout.setHorizontalGroup(
            jPanelDonateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDonateHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneDonateHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDonateHistoryLayout.setVerticalGroup(
            jPanelDonateHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDonateHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneDonateHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Assisted Projects", jPanelDonateHistory);

        jLabelDonate.setText("Donate amount:");

        jButtonDonate.setText("Donate to current project!");
        jButtonDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDonateActionPerformed(evt);
            }
        });

        jButtonLogout.setText("Logout");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDonate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCredits)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGetCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDonate)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDonateAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelLoggedAs)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLogout))
                    .addComponent(jScrollPaneProjectDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelLoggedAs)
                    .addComponent(jButtonLogout))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDonate)
                            .addComponent(jTextFieldDonateAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDonate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCredits)
                            .addComponent(jButtonGetCredits)))
                    .addComponent(jScrollPaneProjectDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jTextFieldSearchParameterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchParameterKeyTyped
        // TODO: LEARN HOW THIS SHIT WORKS
    }//GEN-LAST:event_jTextFieldSearchParameterKeyTyped

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here: MANDAR MODO DE BUSCAR E PARÂMETRO, LISTAR OS RESULTADOS
        try {
            projects = communicator.searchProjects(jComboBoxSearchMode.getSelectedIndex(),jTextFieldSearchParameter.getText());
            jListSearchResults.removeAll();
            
            DefaultListModel listModel = new DefaultListModel();
            jListSearchResults.setModel(listModel);
            for (Communicator.Pair project : projects) {
                listModel.addElement(project.title);
            }
            jListSearchResults.validate();

        } catch (ServerException ex) {
            // se não quer usar a interface como gente, morra motherfucker
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jListSearchResultsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListSearchResultsValueChanged
            try {
                // TODO add your handling code here: PEDIR PROJECT E PRINTAR NA ÁREA DE TEXTO
                if (jListSearchResults.getSelectedIndex() == -1)
                    jTextAreaProjectDescription.setText("Selected project description");
                else
                    jTextAreaProjectDescription.setText(communicator.getProject(projects.get(jListSearchResults.getSelectedIndex()).id));
            } catch (ServerException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    }//GEN-LAST:event_jListSearchResultsValueChanged

    private void jButtonDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDonateActionPerformed
        // TODO add your handling code here: POPUP DE CONFIRMAÇÃO => MANDAR DADOS PRA DONATE; ATUALIZAR CRÉDITOS SE TEVE SUCESSO
        switch (JOptionPane.showConfirmDialog(null, "Donating " + jTextFieldDonateAmount.getText() + 
                                              " to project " + jListSearchResults.getSelectedValue().toString() + 
                                              ".\nConfirm?", "Confirm Donation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
            case JOptionPane.YES_OPTION:
        {
            try {
                jLabelCredits.setText("Credits: " + communicator.donateToProject(projects.get(jListSearchResults.getSelectedIndex()).id, Float.parseFloat(jTextFieldDonateAmount.getText())));
                jTextAreaProjectDescription.setText(communicator.getProject(projects.get(jListSearchResults.getSelectedIndex()).id));
            } catch (ServerException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
                break;
        }
    }//GEN-LAST:event_jButtonDonateActionPerformed

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
    private javax.swing.JList jListDonateHistory;
    private javax.swing.JList jListSearchResults;
    private javax.swing.JPanel jPanelDonateHistory;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JScrollPane jScrollPaneDonateHistory;
    private javax.swing.JScrollPane jScrollPaneProjectDescription;
    private javax.swing.JScrollPane jScrollPaneSearchResults;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextAreaProjectDescription;
    private javax.swing.JTextField jTextFieldDonateAmount;
    private javax.swing.JTextField jTextFieldSearchParameter;
    // End of variables declaration//GEN-END:variables
}
