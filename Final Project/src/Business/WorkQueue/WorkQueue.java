/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestLists;
    private ArrayList<GarmentWorkRequest> workRequestList;
    private ArrayList<DoctorWorkRequest> doctorworkRequestList;
    private ArrayList<EducationWorkRequest> educationWorkLists;
    private ArrayList<GarmentWorkRequest> outsideGarmentWorkRequests;    
    private ArrayList<VolunteerWorkRequest> VolWorkRequests;    
    

 

    public WorkQueue() {
        workRequestLists = new ArrayList();
        workRequestList = new ArrayList();
        doctorworkRequestList= new ArrayList();
        educationWorkLists = new ArrayList();
        outsideGarmentWorkRequests = new ArrayList();
        VolWorkRequests=new ArrayList();
    }

    public ArrayList<VolunteerWorkRequest> getVolWorkRequests() {
        return VolWorkRequests;
    }

    public ArrayList<GarmentWorkRequest> getOutsideGarmentWorkRequests() {
        return outsideGarmentWorkRequests;
    }
    public ArrayList<EducationWorkRequest> geteducationWorkLists() {
        return educationWorkLists;
    }

    public ArrayList<WorkRequest> getWorkRequestLists() {
        return workRequestLists;
    }

    public ArrayList<GarmentWorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<DoctorWorkRequest> getDoctorworkRequestList() {
        return doctorworkRequestList;
    }
       
}