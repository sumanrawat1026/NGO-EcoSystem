/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class GarmentWorkRequest extends WorkRequest{
    private String pants;
    private String sock;
    private String blanket;
    private String jackets;

    public String getSock() {
        return sock;
    }

    public void setSock(String sock) {
        this.sock = sock;
    }

    public String getBlanket() {
        return blanket;
    }

    public void setBlanket(String blanket) {
        this.blanket = blanket;
    }

    public String getJackets() {
        return jackets;
    }

    public void setJackets(String jackets) {
        this.jackets = jackets;
    }


    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public String getMisc() {
        return Misc;
    }

    public void setMisc(String Misc) {
        this.Misc = Misc;
    }
    private String Misc;
    
    private String testResult;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    @Override
     public String toString() 
    { 
        return getMessage();
    } 
    
}
