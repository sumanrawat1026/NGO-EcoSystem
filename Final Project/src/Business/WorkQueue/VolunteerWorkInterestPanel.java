/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author shakt
 */
public class VolunteerWorkInterestPanel extends VolunteerWorkRequest {
      
    UserAccount interested;
    int noOfInterested;
    private static int count = 1;
 

    public VolunteerWorkInterestPanel() {
        noOfInterested = count;
        System.out.println(count);
        count++;
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
 
    @Override
    public String toString() {
        return getJob();
    }
}
