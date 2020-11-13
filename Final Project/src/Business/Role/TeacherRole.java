/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.TeacherOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.TeacherRole.TeacherWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class TeacherRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TeacherWorkAreaJPanel(userProcessContainer, account, (TeacherOrganization)organization, enterprise);
    }
   @Override
    public String toString() {
        return this.getClass().getName();
    }
     
    
}

