/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
import Business.WorkQueue.EducationWorkRequest;
import Business.WorkQueue.GarmentWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import userinterface.VolunteerTeacherRole.ProcessWorkRequestJPanel;

/**
 *
 * @author ankur
 */
public class SeeAllRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SeeAllRequestJPanel
     */
    private UserAccount userAccount;
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    
    SeeAllRequestJPanel(JPanel userProcessContainer,  UserAccount account,Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        //populateRequestTable();
        System.out.println(system.getNetworkList());
        if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Education ){
            populateRequestTableEducation();
        }
        else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Garment ){
            populateRequestTableGarment();
        }
         else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.HealthCare ){
            populateRequestTableHeath();
        }
        
        
        
    }

    public void populateRequestTableEducation(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (EducationWorkRequest request : enterprise.getWorkQueue().geteducationWorkLists()){
            Object[] row = new Object[5];
            
            row[1] = request;
            row[2] = request.getSender().getEmployee().getName(); 
            row[3] = request.getRealReciver();
            row[4] = request.getStatus();
            row[0] = enterprise.getEnterpriseType();
            model.addRow(row);
        }
    }
    
        
    public void populateRequestTableGarment(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (GarmentWorkRequest request : enterprise.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[1] = request;
            row[2] = request.getSender().getEmployee().getName(); 
            row[3] = request.getRealReciver();
            row[4] = request.getStatus();
            row[0] = enterprise.getEnterpriseType();
            
            model.addRow(row);
        }
    }
    
        public void populateRequestTableHeath(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (DoctorWorkRequest request : enterprise.getWorkQueue().getDoctorworkRequestList()){
            Object[] row = new Object[5];
            row[1] = request;
            row[2] = request.getSender().getEmployee().getName(); 
            row[3] = request.getRealReciver();
            row[4] = request.getStatus();
            row[0] = enterprise.getEnterpriseType();
            
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        ViewDetailsJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        refreshJButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Enterpsrise", "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        ViewDetailsJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ViewDetailsJButton.setText("View Details");
        ViewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        refreshJButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshJButton1.setText("Back");
        refreshJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("SEE ALL REQUESTS FOR ADMIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(refreshJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refreshJButton1)
                            .addComponent(ViewDetailsJButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 472, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(308, 308, 308))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewDetailsJButton)
                    .addComponent(refreshJButton))
                .addGap(18, 18, 18)
                .addComponent(refreshJButton1)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        //System.out.println(workRequestJTable.getValueAt(selectedRow, 0));
        if ((workRequestJTable.getValueAt(selectedRow, 0)).equals(enterprise.getEnterpriseType().Garment)) {
            GarmentWorkRequest  request = (GarmentWorkRequest)workRequestJTable.getValueAt(selectedRow, 1);
            //request.setStatus("Processing");
            GarmentRequestJPanel garmentrequestJPanel = new GarmentRequestJPanel(userProcessContainer, enterprise, request, system);
            userProcessContainer.add("GarmentRequestJPanel", garmentrequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
        else if (workRequestJTable.getValueAt(selectedRow, 0).equals(enterprise.getEnterpriseType().Education)) {
             System.out.println(workRequestJTable.getValueAt(selectedRow, 1));

            EducationWorkRequest  request = (EducationWorkRequest)workRequestJTable.getValueAt(selectedRow, 1);
            //request.setStatus("Processing");
            EducationRequestJPanel educationrequestJPanel = new EducationRequestJPanel(userProcessContainer, enterprise, request, system);
            userProcessContainer.add("EducationRequestJPanel", educationrequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else if (workRequestJTable.getValueAt(selectedRow, 0).equals(enterprise.getEnterpriseType().HealthCare)) {
             System.out.println(workRequestJTable.getValueAt(selectedRow, 1));

            DoctorWorkRequest  request = (DoctorWorkRequest)workRequestJTable.getValueAt(selectedRow, 1);
            //request.setStatus("Processing");
            HealthCareRequestJPanel educationrequestJPanel = new HealthCareRequestJPanel(userProcessContainer, enterprise, request, system);
            userProcessContainer.add("HealthCareRequestJPanel", educationrequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_ViewDetailsJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Education ){
            populateRequestTableEducation();
        }
        else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Garment ){
            populateRequestTableGarment();
        }
        
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void refreshJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_refreshJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewDetailsJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton refreshJButton1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
