/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GarmentEmployeeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GarmentWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        messageJTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        messageJTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        messageJTextField6 = new javax.swing.JTextField();
        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        shirttext = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panttext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        shoestext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sockstext = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jacketstext = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        blankettext = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel5.setText("Socks");

        jLabel6.setText("Jackets");

        jLabel7.setText("Blankets");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestTestJButton.setText("Add");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Shirt");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));
        add(shirttext, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 89, -1));

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Pants");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));
        add(panttext, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 89, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Shoes");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));
        add(shoestext, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 89, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Socks");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));
        add(sockstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 89, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Jackets");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));
        add(jacketstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 89, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Blankets");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));
        add(blankettext, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 89, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 630, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        //System.out.println("Hi");
        String shirts = "";
        String pants = "";
        String shoes = "";
        String blanket="";
        String jack="";
        String sock="";
         if (shirttext.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null , " Shirt count cannot be empty");
            return;
        }
        if (panttext.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null , " pant count cannot Be Empty");
            return;
        }

              for (GarmentWorkRequest request1 : userAccount.getWorkQueue().getWorkRequestList()){
//            if (specialtext.getText().equalsIgnoreCase(request1.getSpecialization())) {
//                JOptionPane.showMessageDialog(null , " You have already a specialization");
//                return;
//            }

        }

        if (shoestext.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null , "shoes count cannot be empty");
            return;
        }
        if (sockstext.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null , " shoes count cannot Be empty");
            return;
        }
        if (jacketstext.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null , " jackets count cannot Be empty");
            return;
        }
        if (blankettext.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null , " blanket count cannot Be empty");
            return;
        }
        GarmentWorkRequest request = new GarmentWorkRequest();
        
        
        String regex="^[0-9]";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher= pattern.matcher(shirttext.getText());
            if(!matcher.matches()){
                
                 JOptionPane.showMessageDialog(null, "Please enter valid input");
                return;
            }
            
            String regex1="^[0-9]";
            Pattern pattern1=Pattern.compile(regex1);
            Matcher matcher1= pattern1.matcher(panttext.getText());
            if(!matcher1.matches()){
               
                JOptionPane.showMessageDialog(null, "Please enter valid input");
                return;
            }
            String regex2="^[0-9]";
            Pattern pattern2=Pattern.compile(regex2);
            Matcher matcher2= pattern2.matcher(shoestext.getText());
            if(!matcher2.matches()){
               
                JOptionPane.showMessageDialog(null, "Please enter valid input");
                return;
            }
            String regex3="^[0-9]";
            Pattern pattern3=Pattern.compile(regex3);
            Matcher matcher3= pattern3.matcher(blankettext.getText());
            if(!matcher3.matches()){
                
                JOptionPane.showMessageDialog(null, "Please enter valid input");
                return;
            }
            String regex4="^[0-9]";
            Pattern pattern4=Pattern.compile(regex4);
            Matcher matcher4= pattern4.matcher(jacketstext.getText());
            if(!matcher4.matches()){
                
                 JOptionPane.showMessageDialog(null, "Please enter valid input");
                return;
            }
            String regex5="^[0-9]";
            Pattern pattern5=Pattern.compile(regex5);
            Matcher matcher5= pattern5.matcher(sockstext.getText());
            if(!matcher5.matches()){
                
                JOptionPane.showMessageDialog(null, "Please enter valid input");
                return;
            }
        
           
            
            
            
            
            
            
        
        shirts = shirttext.getText();
        pants = panttext.getText();
        shoes= shoestext.getText();
        blanket=blankettext.getText();
        jack=jacketstext.getText();
        sock=sockstext.getText();
        
        request.setMessage(shirts);
        request.setPants(pants);
        request.setMisc(shoes);
        request.setBlanket(blanket);
        request.setJackets(jack);
        request.setSock(sock);
        request.setSender(userAccount);
        request.setStatus("Sent");
        System.out.println(userAccount.getUsername());
        System.out.println(enterprise);
//        Organization org = null;
//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//            
//            if (organization instanceof LabOrganization){
//                
//                org = organization;
//                break;
//            }
//        }
//        if (org!=null){
//            System.out.println(enterprise);
//            org.getWorkQueue().getWorkRequestList().add(request);
            enterprise.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null,"Details Entered Successfully");
        
        
     
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        GarmentWorkAreaJPanel dwjp = (GarmentWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField blankettext;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jacketstext;
    private javax.swing.JTextField messageJTextField4;
    private javax.swing.JTextField messageJTextField5;
    private javax.swing.JTextField messageJTextField6;
    private javax.swing.JTextField panttext;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField shirttext;
    private javax.swing.JTextField shoestext;
    private javax.swing.JTextField sockstext;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
