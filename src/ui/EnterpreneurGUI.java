/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.WindowEvent;

/**
 *
 * @author Giovani
 */
public class EnterpreneurGUI extends javax.swing.JFrame {

	/**
	 * Creates new form EnterpreneurGUI
	 * @param user
	 */
	public EnterpreneurGUI(String user) {
		initComponents();
		jLabelLoggedAs.setText("Logged as ".concat(user));
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
        jScrollPaneProjectDescription = new javax.swing.JScrollPane();
        jTextAreaProjectDescription = new javax.swing.JTextArea();
        jLabelCurrentProject = new javax.swing.JLabel();
        jLabelPastProjects = new javax.swing.JLabel();
        jScrollPanePastProjects = new javax.swing.JScrollPane();
        jListPastProjects = new javax.swing.JList();
        jButtonNewOrEdit = new javax.swing.JButton();
        jTextFieldCurrentProjectName = new javax.swing.JTextField();
        jButtonSaveEdit = new javax.swing.JButton();
        jButtonDeleteCurrentProject = new javax.swing.JButton();
        jTextFieldCurrentProjectAmount = new javax.swing.JTextField();
        jProgressBarAmount = new javax.swing.JProgressBar();
        jButtonPayMonth = new javax.swing.JButton();
        jButtonWithdraw = new javax.swing.JButton();
        jProgressBarRepay = new javax.swing.JProgressBar();
        jButtonLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitulo.setText("MicroEmprestimos");

        jLabelLoggedAs.setText("Logged as FulanoNomeComprido");

        jTextAreaProjectDescription.setColumns(20);
        jTextAreaProjectDescription.setRows(5);
        jTextAreaProjectDescription.setText("Editar descrição do atual / visualizar descrições dos antigos");
        jScrollPaneProjectDescription.setViewportView(jTextAreaProjectDescription);

        jLabelCurrentProject.setText("Current Project:");

        jLabelPastProjects.setText("Past Projects");

        jListPastProjects.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Past Project 1", "Past Project 2" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPanePastProjects.setViewportView(jListPastProjects);

        jButtonNewOrEdit.setText("New/Edit");

        jTextFieldCurrentProjectName.setText("Nome do Projeto");

        jButtonSaveEdit.setText("Save Edit");

        jButtonDeleteCurrentProject.setText("Delete");

        jTextFieldCurrentProjectAmount.setText("Quantidade requisitada");

        jButtonPayMonth.setText("Pagar mensalidade");

        jButtonWithdraw.setText("Retirar dinheiro!");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCurrentProject)
                                    .addComponent(jLabelPastProjects))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonNewOrEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonSaveEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonDeleteCurrentProject, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldCurrentProjectAmount, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProgressBarAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonWithdraw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jProgressBarRepay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonPayMonth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCurrentProjectName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPanePastProjects))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jScrollPaneProjectDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLoggedAs)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLogout)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCurrentProject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCurrentProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCurrentProjectAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDeleteCurrentProject)
                            .addComponent(jButtonNewOrEdit)
                            .addComponent(jButtonSaveEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBarAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonWithdraw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBarRepay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPayMonth)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPastProjects)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPanePastProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneProjectDescription))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteCurrentProject;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonNewOrEdit;
    private javax.swing.JButton jButtonPayMonth;
    private javax.swing.JButton jButtonSaveEdit;
    private javax.swing.JButton jButtonWithdraw;
    private javax.swing.JLabel jLabelCurrentProject;
    private javax.swing.JLabel jLabelLoggedAs;
    private javax.swing.JLabel jLabelPastProjects;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList jListPastProjects;
    private javax.swing.JProgressBar jProgressBarAmount;
    private javax.swing.JProgressBar jProgressBarRepay;
    private javax.swing.JScrollPane jScrollPanePastProjects;
    private javax.swing.JScrollPane jScrollPaneProjectDescription;
    private javax.swing.JTextArea jTextAreaProjectDescription;
    private javax.swing.JTextField jTextFieldCurrentProjectAmount;
    private javax.swing.JTextField jTextFieldCurrentProjectName;
    // End of variables declaration//GEN-END:variables
}
