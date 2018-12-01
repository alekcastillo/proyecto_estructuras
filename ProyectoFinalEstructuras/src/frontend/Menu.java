/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.BackEnd;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alekc
 */
public class Menu extends javax.swing.JFrame {
    private BackEnd backend;

    /**
     * Creates new form ViewProject
     */
    public Menu(BackEnd backend) {
        initComponents();
        this.backend = backend;
        
        fillForm();
    }
    
    private void enableEditButtons() {
        btnDeleteProject.setEnabled(true);
        btnEditProject.setEnabled(true);
    }
    
    private void fillForm() {
        tblProjects.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                if (tblProjects.getSelectedRow() > -1) {
                    enableEditButtons();
                }
            }
        });
        
        DefaultTableModel model = new DefaultTableModel(
            null,
            new String [] {"Title", "Sprints", "Tasks in backlog"});
        
        for (int x = 1; x <= backend.projects.length(); x++) {
            model.addRow(backend.projects.get(x).getObject().getTableRow());
        }
        
        tblProjects.setModel(model);
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
        btnExit = new javax.swing.JButton();
        btnEditProject = new javax.swing.JButton();
        btnDeleteProject = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblProjects = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProjects = new javax.swing.JTable();
        btnNewProject = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtWelcome = new javax.swing.JTextPane();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnEditProject.setText("View/Edit project");
        btnEditProject.setEnabled(false);
        btnEditProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProjectActionPerformed(evt);
            }
        });

        btnDeleteProject.setText("Delete project");
        btnDeleteProject.setEnabled(false);
        btnDeleteProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProjectActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setText("Welcome back!");

        lblProjects.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblProjects.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProjects.setText("Projects");

        tblProjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblProjects);

        btnNewProject.setText("Add project");
        btnNewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProjectActionPerformed(evt);
            }
        });

        txtWelcome.setEditable(false);
        txtWelcome.setBackground(new java.awt.Color(240, 240, 240));
        txtWelcome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jScrollPane2.setViewportView(txtWelcome);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProjects))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteProject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditProject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewProject, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle)
                    .addComponent(lblProjects))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteProject)
                    .addComponent(btnEditProject)
                    .addComponent(btnNewProject)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProjectActionPerformed
        new ViewProject(this.backend).show();
        dispose();
    }//GEN-LAST:event_btnNewProjectActionPerformed

    private void btnEditProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProjectActionPerformed
        new ViewProject(this.backend, this.backend.projects.get(tblProjects.getSelectedRow() + 1).getObject()).show();
        dispose();
    }//GEN-LAST:event_btnEditProjectActionPerformed

    private void btnDeleteProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProjectActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this project?");
        
        if (confirmation == JOptionPane.YES_OPTION) {
            this.backend.projects.delete(tblProjects.getSelectedRow() + 1);
            fillForm();
            
            JOptionPane.showMessageDialog(null, "Project deleted succesfully!");
        }
    }//GEN-LAST:event_btnDeleteProjectActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        JOptionPane.showMessageDialog(null, "Thanks for using Agiler!");
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteProject;
    private javax.swing.JButton btnEditProject;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewProject;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblProjects;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblProjects;
    private javax.swing.JTextPane txtWelcome;
    // End of variables declaration//GEN-END:variables
}
