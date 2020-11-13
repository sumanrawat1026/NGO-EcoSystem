/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class GarmentEmployee extends Organization{

    public GarmentEmployee() {
        super(Organization.Type.GarmentEmployee.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Business.Role.GarmentEmployeeRole());
        return roles;
    }
     
} 