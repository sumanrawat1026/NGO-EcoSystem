/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Shash
 */
public class DoctorWorkRequest extends WorkRequest{
        private String doctor;
        private String capsule;
        private String syrup;
        private String bandage;
        private String injections;
        private String days;
        private String specialization;

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getCapsule() {
        return capsule;
    }

    public void setCapsule(String capsule) {
        this.capsule = capsule;
    }

    public String getSyrup() {
        return syrup;
    }

    public void setSyrup(String syrup) {
        this.syrup = syrup;
    }

    public String getBandage() {
        return bandage;
    }

    public void setBandage(String bandage) {
        this.bandage = bandage;
    }

    public String getInjections() {
        return injections;
    }

    public void setInjections(String injections) {
        this.injections = injections;
    }

//    public String getAvailability() {
//        return Availability;
//    }
//
//    public void setAvailability(String Availability) {
//        this.Availability = Availability;
//    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
        
    
    private String testResult;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
     public String toString() 
    { 
        return getDoctor();
    }
    
}
