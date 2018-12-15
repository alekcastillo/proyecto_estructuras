/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.BackEnd;
import backend.Project;
import backend.Sprint;
import backend.Task;
import javax.swing.JOptionPane;

/**
 *
 * @author alekc
 */
public class ViewTask extends javax.swing.JFrame {
    private BackEnd backend;
    private Project project;
    private Sprint sprint;
    private Task task;

    /**
     * Creates new form ViewTask
     */
    public ViewTask(BackEnd backend, Project project, Sprint sprint) {
        initComponents();
        this.backend = backend;
        this.project = project;
        this.sprint = sprint;
        
        lblInformation.setText("New task");
        
        fillForm();
        fillcBoxes();
    }
    
    public ViewTask(BackEnd backend, Project project, Sprint sprint, Task task) {
        initComponents();
        this.backend = backend;
        this.project = project;
        this.sprint = sprint;
        this.task = task;
        
        fillForm();
        fillcBoxes();
    }
    
    private void saveTask() {
        task.setTitle(txtTitle.getText());
        task.setDescription(txtDescription.getText());
        task.setPriority(Integer.parseInt(txtPriority.getText()));
        task.setStatus(cboxStatus.getSelectedIndex());
        task.setAssignee(backend.users.get(cboxAssignee.getSelectedIndex()).getObject());
    }
    
    private void fillcBoxes() {
        for (String status : Task.getStatuses()) {
            cboxStatus.addItem(status);
        }
        
        for (String user : backend.users.getUserNames()) {
            cboxAssignee.addItem(user);
        }
    }
    
    private void fillForm() {
        txtProject.setText(project.getTitle());
        txtSprint.setText(sprint.getTitle());
            
        if (task != null) {
            txtTitle.setText(task.getTitle());
            txtDescription.setText(task.getDescription());
            txtPriority.setText(String.valueOf(task.getPriority()));
            cboxStatus.setSelectedIndex(task.getStatus());
            cboxAssignee.setSelectedIndex(task.getAssignee().getId());
            
            setEditable(true);
        }
    }
    
    private void setEditable(boolean editable) {
        cboxStatus.setEnabled(editable);
        btnDiscard.setEnabled(editable);
    }
    
        
    private boolean checkFields() {
        boolean output = true;
        
        if (txtTitle.getText().isEmpty() || txtDescription.getText().isEmpty() || txtPriority.getText().isEmpty() || cboxAssignee.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields!");
            output = false;
        }
        
        if (!backend.isNumber(txtPriority.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter a valid priority (from 1 to 10)!");
            output = false;
        } else if (Integer.valueOf(txtPriority.getText()) < 1 || Integer.valueOf(txtPriority.getText()) > 10) {
            JOptionPane.showMessageDialog(null, "Please enter a valid priority (from 1 to 10)!");
            output = false;
        }
        
        return output;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInformation = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        txtProject = new javax.swing.JTextField();
        lblProject = new javax.swing.JLabel();
        lblSprint = new javax.swing.JLabel();
        txtSprint = new javax.swing.JTextField();
        lblPriority = new javax.swing.JLabel();
        txtPriority = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        cboxStatus = new javax.swing.JComboBox<>();
        lblAssignee = new javax.swing.JLabel();
        cboxAssignee = new javax.swing.JComboBox<>();
        btnReturn = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDiscard = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblInformation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblInformation.setText("Task Information");

        txtTitle.setBackground(new java.awt.Color(240, 240, 240));
        txtTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblTitle.setText("Title");

        lblDescription.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblDescription.setText("Description");

        txtProject.setEditable(false);
        txtProject.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblProject.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblProject.setText("Project");

        lblSprint.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblSprint.setText("Sprint");

        txtSprint.setEditable(false);
        txtSprint.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblPriority.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblPriority.setText("Priority");

        txtPriority.setBackground(new java.awt.Color(240, 240, 240));
        txtPriority.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblStatus.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblStatus.setText("Status");

        cboxStatus.setEnabled(false);

        lblAssignee.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblAssignee.setText("Assignee");

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnSave.setText("Save changes");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDiscard.setText("Discard changes");
        btnDiscard.setEnabled(false);
        btnDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardActionPerformed(evt);
            }
        });

        txtDescription.setBackground(new java.awt.Color(240, 240, 240));
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtDescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDiscard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProject)
                            .addComponent(lblTitle)
                            .addComponent(lblDescription)
                            .addComponent(txtTitle)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(txtProject))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPriority)
                            .addComponent(txtSprint, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxAssignee, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSprint, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPriority, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAssignee, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInformation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProject)
                    .addComponent(lblSprint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSprint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(lblPriority))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAssignee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDescription)
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboxAssignee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(btnSave)
                    .addComponent(btnDiscard))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (checkFields()) {
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to save this task?");
            
            if (confirmation == JOptionPane.YES_OPTION) {
                if (task != null) {
                    saveTask();
                } else {
                    task = sprint.addTask(cboxStatus.getSelectedIndex(), Integer.valueOf(txtPriority.getText()), txtTitle.getText(), txtDescription.getText(), backend.users.get(cboxAssignee.getSelectedIndex()).getObject());
                }

                JOptionPane.showMessageDialog(null, "Task saved succesfully!");

                fillForm();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        if (sprint.isBacklog())
            new ViewBacklog(backend, project).show();
        else
            new ViewSprint(backend, project, sprint).show();
        
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to discard your changes to this task?");

        if (confirmation == JOptionPane.YES_OPTION) {
            fillForm();
        }
    }//GEN-LAST:event_btnDiscardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiscard;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboxAssignee;
    private javax.swing.JComboBox<String> cboxStatus;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAssignee;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblInformation;
    private javax.swing.JLabel lblPriority;
    private javax.swing.JLabel lblProject;
    private javax.swing.JLabel lblSprint;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtPriority;
    private javax.swing.JTextField txtProject;
    private javax.swing.JTextField txtSprint;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
