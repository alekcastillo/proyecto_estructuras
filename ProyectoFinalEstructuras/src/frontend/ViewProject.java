/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.BackEnd;
import backend.Project;

/**
 *
 * @author alekc
 */
public class ViewProject extends javax.swing.JFrame {
    BackEnd backend;

    /**
     * Creates new form ViewProject
     */
    public ViewProject(BackEnd backend, Project project) {
        initComponents();
        this.backend = backend;
    }
    
    public ViewProject(BackEnd backend) {
        initComponents();
        this.backend = backend;
        
        lblInformation.setText("New project");
        chkEdit.setSelected(true);
        chkEdit.setEnabled(false);
        this.setEditable(true);
    }
    
    public void setEditable(boolean editable) {
        txtTitle.setEditable(editable);
        txtDescription.setEditable(editable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lblTitle = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        btnEditSprint = new javax.swing.JButton();
        btnDeleteSprint = new javax.swing.JButton();
        lblInformation = new javax.swing.JLabel();
        lblSprints = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSprints = new javax.swing.JTable();
        btnNewSprint = new javax.swing.JButton();
        lblEdit = new javax.swing.JLabel();
        chkEdit = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblTitle.setText("Title");

        btnReturn.setText("Return");

        btnEditSprint.setText("View/Edit sprint");
        btnEditSprint.setEnabled(false);

        btnDeleteSprint.setText("Delete sprint");
        btnDeleteSprint.setEnabled(false);

        lblInformation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblInformation.setText("Project information");

        lblSprints.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblSprints.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSprints.setText("Sprints");

        txtTitle.setEditable(false);
        txtTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txtDescription.setEditable(false);
        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblDescription.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblDescription.setText("Description");

        tblSprints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblSprints);

        btnNewSprint.setText("Add sprint");
        btnNewSprint.setEnabled(false);

        lblEdit.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblEdit.setText("Edit");

        chkEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEditActionPerformed(evt);
            }
        });

        btnSave.setText("Save changes");
        btnSave.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitle)
                            .addComponent(txtTitle)
                            .addComponent(lblDescription)
                            .addComponent(txtDescription)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSprints))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteSprint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditSprint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewSprint, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInformation)
                    .addComponent(lblSprints))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lblDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdit)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteSprint)
                    .addComponent(btnEditSprint)
                    .addComponent(btnNewSprint)
                    .addComponent(btnReturn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEditActionPerformed
        this.setEditable(chkEdit.isSelected());
    }//GEN-LAST:event_chkEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteSprint;
    private javax.swing.JButton btnEditSprint;
    private javax.swing.JButton btnNewSprint;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkEdit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblInformation;
    private javax.swing.JLabel lblSprints;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblSprints;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
