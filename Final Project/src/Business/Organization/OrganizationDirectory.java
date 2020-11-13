/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new Doctor();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
         if (type.getValue().equals(Type.Teacher.getValue())){
            organization = new TeacherOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new VolunteerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.GarmentEmployee.getValue())){
            organization = new GarmentEmployee();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
}