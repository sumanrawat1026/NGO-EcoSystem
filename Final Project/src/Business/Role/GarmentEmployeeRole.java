/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.GarmentEmployee;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.GarmentEmployeeRole.GarmentWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class GarmentEmployeeRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new GarmentWorkAreaJPanel(userProcessContainer, account, (GarmentEmployee)organization, enterprise);
    }
    
    
}
