/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.Role;
import Business.Role.TeacherRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class TeacherOrganization extends Organization{

    public TeacherOrganization() {
        super(Organization.Type.Teacher.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TeacherRole());
        return roles;
    }
     
   
    
    
}
