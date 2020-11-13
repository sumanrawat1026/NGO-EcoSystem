/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TeacherRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.TeacherOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.VolunteerTeacherRole.VolunteerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class RequestJobJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise; 
    private UserAccount userAccount;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestJobJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        System.out.println(enterprise);
        valueLabel.setText(enterprise.getName());
        jcombo1.removeAllItems();
        jcombo1.addItem("Male");
        jcombo1.addItem("Female");
        jcombo1.addItem("Other");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitAppJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        courseJText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        expJText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        qualificationJText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        skillsJText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCertification = new javax.swing.JTextField();
        jcombo1 = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitAppJButton.setText("Submit Application");
        submitAppJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitAppJButtonActionPerformed(evt);
            }
        });
        add(submitAppJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("UserName : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 20));

        messageJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageJTextFieldActionPerformed(evt);
            }
        });
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 89, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Course To Teach");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, 20));
        add(courseJText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 89, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Experience");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 20));
        add(expJText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 89, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Highest Qualification");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 20));
        add(qualificationJText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 89, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Skills");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 20));
        add(skillsJText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 89, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Gender : ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 160, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Address : ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 160, 20));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 89, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Mobile Number : ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 160, 20));

        txtMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNumberActionPerformed(evt);
            }
        });
        add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 89, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Age : ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 160, 20));

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 89, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Certification if any :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 170, 20));

        txtCertification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCertificationActionPerformed(evt);
            }
        });
        add(txtCertification, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 89, -1));

        jcombo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombo1ActionPerformed(evt);
            }
        });
        add(jcombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitAppJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitAppJButtonActionPerformed
        EducationWorkRequest request = new EducationWorkRequest();
        
        if (messageJTextField.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null , " About Yourself Cannot Be Empty");
            return;
        }
        if (courseJText.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null , " Course Cannot Be Empty");
            return;
        }
        
        
        for (EducationWorkRequest request1 : userAccount.getWorkQueue().geteducationWorkLists()){
            if (courseJText.getText().equalsIgnoreCase(request1.getCourse())) {
            JOptionPane.showMessageDialog(null , " You Have Already Applied For This Course");
            return;
        }
         
        }
        
        if (txtAddress.getText() == ""){
            JOptionPane.showMessageDialog(null , "Address cannot be empty");
            return;
        }
        
        String age = txtAge.getText();
        try {
            Integer.parseInt(age);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, age + " is not a valid Age.");
            return;
        }
        
        if (qualificationJText.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null , " Qualification Cannot Be Empty");
            return;
        }
        if (skillsJText.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null , " Skills Cannot Be Empty");
            return;
        }
        if (txtMobileNumber.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null , " Mobile Number Cannot Be Empty");
            return;
        }
        String regex="^[0-9]{10}";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher= pattern.matcher(txtMobileNumber.getText());
            if(!matcher.matches()){
                
                JOptionPane.showMessageDialog(null, "Please enter valid input");
                return;
            }
           String number= txtMobileNumber.getText();
           


        String message = messageJTextField.getText();
        String course = courseJText.getText();      
        String qualification = qualificationJText.getText();
        String skills = skillsJText.getText();
        String exp = expJText.getText();
        
        try {
            Float.parseFloat(exp);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, exp + " Enter Experience in Years");
            return;
        }
        float experience = Float.parseFloat(exp);
        
        String gender = (String)jcombo1.getSelectedItem();
        
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setCourse(course);
        request.setAddress(txtAddress.getText());
        request.setQualification(qualification);
        request.setExperience(experience);
        request.setSkills(skills);
        request.setAge(Integer.parseInt(txtAge.getText()));
        request.setCertification(txtCertification.getText());
        request.setGender(gender);
        request.setPhone(number);
        
        
//        Organization org = null;
//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//            System.out.println(organization);
//
//            if (organization instanceof TeacherOrganization){
//                org = organization;
//                            System.out.println("yahan org aa gya");
//
//                break;
//            }
//        }
//        if (org!=null){
//            System.out.println("yahan aa gya");
//            org.getWorkQueue().geteducationWorkLists().add(request);
            userAccount.getWorkQueue().geteducationWorkLists().add(request);
            System.out.println(enterprise.getWorkQueue().geteducationWorkLists());
            enterprise.getWorkQueue().geteducationWorkLists().add(request);
            JOptionPane.showMessageDialog(null, " Application Submitted");
       // }
        
    }//GEN-LAST:event_submitAppJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        VolunteerWorkAreaJPanel dwjp = (VolunteerWorkAreaJPanel) component;
//        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void messageJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageJTextFieldActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNumberActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtCertificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCertificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCertificationActionPerformed

    private void jcombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombo1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField courseJText;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTextField expJText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox jcombo1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTextField qualificationJText;
    private javax.swing.JTextField skillsJText;
    private javax.swing.JButton submitAppJButton;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCertification;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}