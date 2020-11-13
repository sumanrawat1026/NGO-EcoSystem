/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.VolunteerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.TeacherRole.TeacherWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.VolunteerTeacherRole.VolunteerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class VolunteerTeacherRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VolunteerWorkAreaJPanel(userProcessContainer, account, organization, enterprise,business);
    }
    
    
}
