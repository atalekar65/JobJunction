
package com.earnestpro.jobjunction.application;
import java.util.Date;

public class Application {
    int  candidate_id,job_id,application_id; 
    String date_application;

    public int getCandidate_id() {
        return candidate_id;
    }

    public void setCandidate_id(int candidate_id) {
        this.candidate_id = candidate_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getApplication_id() {
        return application_id;
    }

    public void setApplication_id(int application_id) {
        this.application_id = application_id;
    }

    public String getDate_application() {
        return date_application;
    }

    public void setDate_application(String date_application) {
        this.date_application = date_application;
    }
    
    public Application(int job_id,int candidate_id,String date_application)
    {
        this.job_id=job_id;
        this.candidate_id=candidate_id;
        this.date_application=date_application;
                
    }
}
