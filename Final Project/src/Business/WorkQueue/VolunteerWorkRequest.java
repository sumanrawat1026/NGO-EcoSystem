/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author shakt
 */
public class VolunteerWorkRequest extends WorkRequest {
      String location;
      String job;
      String desc;
      UserAccount interested;
      int noOfInterested;
      ArrayList<String> applicants;
      
      Date date;
      private static int count = 1;
 

    public VolunteerWorkRequest() {
        noOfInterested = count;
        applicants=new ArrayList();
        System.out.println(count);
        count++;
    }

    public ArrayList<String> getApplicants() {
        return applicants;
    }

    public void setApplicants(ArrayList<String> applicants) {
        this.applicants = applicants;
    }

    public int getNoOfInterested() {
        return noOfInterested;
    }
    
    public UserAccount getInterested() {
        return interested;
    }

    public void setInterested(UserAccount interested) {
        this.interested = interested;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    @Override
    public String toString() {
        return getJob();
    }
}
