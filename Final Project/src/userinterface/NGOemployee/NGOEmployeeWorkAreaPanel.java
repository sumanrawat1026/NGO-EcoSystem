/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGOemployee;
import java.awt.Dimension;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
import Business.WorkQueue.EducationWorkRequest;
import Business.WorkQueue.GarmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import userinterface.AdministrativeRole.OutsideReuestJPanel;

/**
 *
 * @author raunak
 */
public class NGOEmployeeWorkAreaPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private LabOrganization labOrganization;
    private String course;
    private float Experoence ;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public NGOEmployeeWorkAreaPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business ) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = (LabOrganization)organization;
//        System.out.println(organization);
        populateRequestTableEducation();
        populateRequestTableGarment();
        populateRequestTableDoctor();
    }
    
     public void populateRequestTableEducation(){
        
        DefaultCategoryDataset base = new DefaultCategoryDataset();
        DefaultTableModel model = (DefaultTableModel) educationTable.getModel();
        model.setRowCount(0);
        
        for(Network network: business.getNetworkList()){
            for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                for (EducationWorkRequest request : enterprise.getWorkQueue().geteducationWorkLists()){
            Object[] row = new Object[8];
            
            row[0] = request.getCourse();
            row[1] = request.getQualification();
            row[2] =  request.getExperience();
            row[3] = request;
            row[4] = request.getReceiver();
            row[5] = request.getStatus();
            
            model.addRow(row);
        }
            }
        }
        
        
        
    }
    
        
     public void populateRequestTableGarment(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
         
        
        for(Network network: business.getNetworkList()){
            for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                for (GarmentWorkRequest request : enterprise.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[8];
                    System.out.println(request.getSender());
            row[0] = request;
            row[1] = request.getPants();
//            row[2] = request.getMisc(); 
            row[2]=request.getMisc();
            row[3]=request.getSock();
            row[4]=request.getJackets();
            row[5]=request.getBlanket();
            row[6] = request.getSender();
            row[7] = request.getStatus();
            
            model.addRow(row);
        }
            }
        }
        
        
        
    }
      public void populateRequestTableDoctor(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable1.getModel();
        model.setRowCount(0);
         
        
        for(Network network: business.getNetworkList()){
            for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                for (DoctorWorkRequest request : enterprise.getWorkQueue().getDoctorworkRequestList()){
            Object[] row = new Object[8];
                    System.out.println(request.getSender());
            row[0] = request;
            row[1] = request.getSpecialization();
//            row[2] = request.getMisc(); 
            row[2]=request.getCapsule();
            row[3]=request.getSyrup();
            row[4]=request.getBandage();
//            row[5]=request.getBlanket();
            row[5] = request.getSender();
            row[6] = request.getStatus();
            
            model.addRow(row);
        }
            }
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

        btnApprove = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        educationTable = new javax.swing.JTable();
        addJob = new javax.swing.JButton();
        barGraphbtn = new javax.swing.JButton();
        eventDetailBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnApprove.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        btnApprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGOemployee/tick2.jpg"))); // NOI18N
        btnApprove.setText("APPROVE");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, -1, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        educationTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        educationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Course", "Qualification", "Experience", "Message", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(educationTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 990, 130));

        addJob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addJob.setText("Add Event");
        addJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJobActionPerformed(evt);
            }
        });
        add(addJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, -1, -1));

        barGraphbtn.setBackground(new java.awt.Color(0, 153, 153));
        barGraphbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        barGraphbtn.setText("Show Graph");
        barGraphbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barGraphbtnActionPerformed(evt);
            }
        });
        add(barGraphbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, -1));

        eventDetailBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eventDetailBtn.setText("Event Details");
        eventDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventDetailBtnActionPerformed(evt);
            }
        });
        add(eventDetailBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 620, -1, -1));

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Shits", "Pants", "Shoes", "Sock", "Blanket", "Jackets", "Sender", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 980, 120));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1000, -1));

        workRequestJTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor", "Specialization", "Capsule", "Syrup", "Bandage", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestJTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 350, 980, 130));

        jLabel1.setText("Health Care Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        jLabel2.setText("Education Requests");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        jLabel3.setText("Garment Requests");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        System.out.println("approve button");
        
        
        int selectedRowEdu = educationTable.getSelectedRow();
        if (selectedRowEdu < 0){
            int selectedRowGar = workRequestJTable.getSelectedRow();
                if (selectedRowGar < 0) {
                      
                    JOptionPane.showMessageDialog(null , "Please Select Row ");
                    return;

//                    int selectedRowDoc = workRequestJTable1.getSelectedRow();
//                    if (selectedRowDoc < 0) {
//                    JOptionPane.showMessageDialog(null , "Please Select Row ");
//                    return;
//                }
//                else{
//                    WorkRequest request = (WorkRequest)workRequestJTable1.getValueAt(selectedRowGar, 0);
//                    request.setReceiver(userAccount);
//                    request.setStatus("APPROVED");
//                    populateRequestTableGarment();
//                    return;
//                }
                }
                else{
                    WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRowGar, 0);
                    request.setReceiver(userAccount);
                    request.setStatus("APPROVED");
                    populateRequestTableGarment();
                    return;
                }
            
        }
        
        WorkRequest request = (WorkRequest)educationTable.getValueAt(selectedRowEdu, 3);
        request.setReceiver(userAccount);
        request.setStatus("APPROVED");
        populateRequestTableGarment();
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateRequestTableGarment();
        populateRequestTableEducation();
        populateRequestTableDoctor();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void addJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJobActionPerformed
        // TODO add your handling code here:
       AddJob muajp = new AddJob(userProcessContainer, business);
        userProcessContainer.add("AddJob", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addJobActionPerformed

    private void barGraphbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barGraphbtnActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset ded = new DefaultCategoryDataset();
//        ded.setValue(70, "Marks", "A");
//        ded.setValue(80, "Marks", "An");
//        ded.setValue(60, "Marks", "Ak");
//        ded.setValue(90, "Marks", "oA");
//        ded.setValue(75, "Marks", "EA");
//                   
 
        for (int i = 0; i < educationTable.getRowCount(); i++) {
            System.out.println("loop");
            course = (String) educationTable.getValueAt(i, 0);
            Experoence = Float.valueOf((Float) educationTable.getValueAt(i, 2));
            System.out.println(course);
            System.out.println(Experoence);
            ded.setValue( Experoence, "Fréquences", course);
        }
        
        JFreeChart jchart = ChartFactory.createBarChart("Course-Experience Relation", "Course", "Experience", ded, PlotOrientation.VERTICAL, true, true, false );
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        ChartFrame chartframe = new ChartFrame("Course-Experience Relation", jchart, true);
        chartframe.setVisible(true);
        chartframe.setSize(500,400);
    }//GEN-LAST:event_barGraphbtnActionPerformed

    private void eventDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventDetailBtnActionPerformed
        // TODO add your handling code here:
        EventVolunteerJPanel eventdetail = new EventVolunteerJPanel(userProcessContainer, business);
        userProcessContainer.add("EventVolunteerJPanel", eventdetail);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_eventDetailBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJob;
    private javax.swing.JButton barGraphbtn;
    private javax.swing.JButton btnApprove;
    private javax.swing.JTable educationTable;
    private javax.swing.JButton eventDetailBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables
}
